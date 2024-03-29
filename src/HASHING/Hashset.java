package HASHING;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        System.out.println(set);
        if(set.contains(2)){
            System.out.println("set contains 2");
        }
        else{
            System.out.println("set doesn't contain 2");
        }
        if(set.contains(5)){
            System.out.println("set contains 5");
        }
        else{
            System.out.println("set doesn't contain 5");
        }

        set.clear();//will delete everything

        System.out.println(set.size());

        System.out.println(set.isEmpty());//true if empty , false if not empty
    }
}
