package HASHING;

import java.util.*;

public class CoutryPopMap {
    public static void main(String[] args) {

        //Create
        HashMap<String,Integer> map=new HashMap<>();

        //Insert-O(1)
        map.put("India",100);
        map.put("China",150);
        map.put("US",200);

        System.out.println(map);

        //get-O(1)
        int pop=map.get("India");
        System.out.println(pop);
        System.out.println(map.get("Indonesia"));//null

        //containsKey-check if key exists or not true or false - O(1)
        System.out.println(map.containsKey("India"));//true
        System.out.println(map.containsKey("Indonesia"));//false

        //remove-deletes both key and value-O(1)
        System.out.println(map.remove("China"));//150 and will delete it
        System.out.println(map.remove("Indonesia"));//null

        //size-to check size
        System.out.println(map.size());

        //IsEmpty
        System.out.println(map.isEmpty());

        //clear-clears the whole hashmap
        map.clear();

        System.out.println(map);
    }
}

//HashMap is an unordered map in java