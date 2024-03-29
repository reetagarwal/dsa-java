package HASHING;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("Noida");
        set.add("Bangalore");
        set.add("Delhi");
        set.add("Chennai");
        System.out.println(set);

    }
}

//order is maintained
