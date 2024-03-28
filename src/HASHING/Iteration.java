package HASHING;

import java.util.HashMap;
import java.util.Set;

public class Iteration {
    public static void main(String[] args) {
        HashMap<String ,Integer> map=new HashMap<>();
        map.put("India",200);
        map.put("Bangladesh",400);
        map.put("CHINA",150);
        map.put("US",670);
        map.put("AFRICA",90);

        //Iterate
        //hm.entrySet()-you can use except for that for each loop but logical stuff you can do with loop
        Set<String> keys=map.keySet();
        System.out.println(keys);

        for(String k:keys){//for each loop
            System.out.println("key="+k+",value="+map.get(k));
        }
    }
}
