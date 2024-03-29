package HASHING;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s,t));

    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character , Integer> map=new HashMap<>();//character , freq
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            if(map.get(t.charAt(i))!=null){
                if(map.get(t.charAt(i))==1){
                    map.remove(t.charAt(i));
                }
                else {
                    map.put(t.charAt(i),map.get(t.charAt(i))-1);
                }
            }
            else {
                return false;
            }
        }
        return map.isEmpty();
    }
}
