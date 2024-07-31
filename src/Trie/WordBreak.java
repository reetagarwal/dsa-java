package Trie;

public class WordBreak {
    static class Node{
        boolean endOfWord=false;
        Node children[]=new Node[26];


        public Node() {
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }

    public static Node root=new Node();

    public static void insert(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.endOfWord=true;
    }

    public static boolean search(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.endOfWord;
    }


    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
              if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
                  return true;
              }
        }
        return false;
    }
    public static void main(String[] args) {
        String arr[]={"i","like","sam","samsung","mobile","ice"};
        for(int i=0;i< arr.length;i++){
            insert(arr[i]);
        }

        String key="ilikesamsung";
        System.out.println(wordBreak(key));
    }
}





//class Solution {
//    static class Node{
//        boolean endOfWord;
//        Node[] children=new Node[26];
//
//        Node(){
//            for(int i=0;i<26;i++){
//                children[i]=null;
//            }
//        }
//    }
//
//    public static Node root=new Node();
//
//    public boolean wordBreak(String s, List<String> wordDict) {
//        for (String word : wordDict) {
//            insert(word);
//        }
//        return wordBreakHelper(s);
//    }
//
//    public boolean wordBreakHelper(String key){
//        if(key.length()==0){
//            return true;
//        }
//        for(int i=1;i<=key.length();i++){
//            if(search(key.substring(0,i)) && wordBreakHelper(key.substring(i))){
//                return true;
//            }
//        }
//        return false;
//    }
//
//
//    public void insert(String word) {
//        Node curr=root;
//        for(int level=0;level<word.length();level++){
//            int idx=word.charAt(level)-'a';
//            if(curr.children[idx]==null){
//                curr.children[idx]=new Node();
//            }
//            curr=curr.children[idx];
//        }
//        curr.endOfWord=true;
//    }
//    public boolean search(String word) {
//        Node curr=root;
//        for(int level=0;level<word.length();level++){
//            int idx = word.charAt(level) - 'a';
//            if(curr.children[idx]==null){
//                return false;
//            }
//            curr=curr.children[idx];
//        }
//        return curr.endOfWord;
//    }
//}
