import java.util.List;

public class Solution {
    static class Node {
        boolean endOfWord;
        Node[] children = new Node[26];

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public boolean wordBreak(String s, List<String> wordDict) {
        // Insert all words from wordDict into the Trie
        for (String word : wordDict) {
            insert(word);
        }
        // Check word break using a helper method
        return wordBreakHelper(s, 0);
    }

    private boolean wordBreakHelper(String s, int start) {
        if (start == s.length()) {
            return true; // Reach the end of the string, found a valid segmentation
        }
        Node curr = root;
        for (int i = start; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false; // Prefix not found in Trie
            }
            curr = curr.children[idx];
            if (curr.endOfWord && wordBreakHelper(s, i + 1)) {
                return true; // Found a word, check the rest of the string
            }
        }
        return false; // No valid segmentation found
    }

    public void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.endOfWord = true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> wordDict1 = List.of("leet", "code");
        String s1 = "leetcode";
        System.out.println(solution.wordBreak(s1, wordDict1)); // should print true

        List<String> wordDict2 = List.of("b");
        String s2 = "a";
        System.out.println(solution.wordBreak(s2, wordDict2)); // should print false
    }
}

