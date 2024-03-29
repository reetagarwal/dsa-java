package HASHING;

//import java.util.HashSet;
//import java.util.Iterator;
import java.util.*;

public class IterationHashset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Noida");
        cities.add("Bangalore");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Mumbai");
        cities.add("Bhubaneswar");

        //normal iterator method
        Iterator it= cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //enhanced loop way
        for(String city:cities){
            System.out.println(city);
        }
    }


}
