package HASHING;
import java.util.*;
public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String , Integer> map=new LinkedHashMap<>();
        map.put("India",100);
        map.put("China",150);
        map.put("US",200);
        map.put("Nepal",40);
        System.out.println(map);
    }
}

//same as HashMap just the diff is it is ordered where as HashMap is not ordered , randomly results are displayed