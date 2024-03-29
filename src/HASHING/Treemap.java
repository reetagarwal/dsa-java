package HASHING;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String , Integer> map=new TreeMap<>();
        map.put("India" ,100);
        map.put("China",200);
        map.put("US",50);
        map.put("Africa",800);
        map.put("Indonesia",80);
        System.out.println(map);
    }
}

//same as hashmap just that treemap is sorted->alphabetical order