package Graph;

import java.io.IOException;
import java.util.*;
class ladder {
    String first;
    int second;
    ladder(String _first, int _second) {
        this.first = _first;
        this.second = _second;
    }
}
public class wordLadder1 {
    public static void main(String[] args) throws IOException {
        String startWord = "der", targetWord = "dfs";
        String[] wordList = {
                "des",
                "der",
                "dfr",
                "dgt",
                "dfs"
        };

        wordLadder1 obj = new wordLadder1();
        int ans = obj.wordLadderLength(startWord, targetWord, wordList);

        System.out.print(ans);

        System.out.println();
    }

    public int wordLadderLength(String beginWord, String endWord, String[] wordList) {
        Queue<ladder> q = new LinkedList<>();
        q.add(new ladder(beginWord, 1));
        Set<String> st = new HashSet<String>(List.of(wordList));
        st.remove(beginWord);

        while (!q.isEmpty()) {
            String word = q.peek().first;
            int steps = q.peek().second;
            q.remove();
            if (word.equals(endWord))
                return steps;
            for (int i = 0; i < word.length(); i++) {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    char[] replacedCharArray = word.toCharArray();
                    replacedCharArray[i] = ch;
                    String replacedWord = new String(replacedCharArray);


                    if (st.contains(replacedWord)) {
                        st.remove(replacedWord);
                        q.add(new ladder(replacedWord, steps + 1));
                    }
                }
            }
        }

        return 0;
    }
}
