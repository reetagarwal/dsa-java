package HASHING;

import java.util.HashMap;

public class ItineraryTickets {
    public static void main(String[] args) {
        HashMap<String , String> tickets=new HashMap<>();//from->to
        tickets.put("Chennai" , "Bengaluru");
        tickets.put("Mumbai" , "Delhi");
        tickets.put("Goa" , "Chennai");
        tickets.put("Delhi" , "Goa");

        String start=getStart(tickets);
        System.out.print(start);
        for(String key: tickets.keySet()){
            System.out.print("->" + tickets.get(start));
            start=tickets.get(start);//updating
        }
        System.out.println();
    }

    public static String getStart(HashMap<String , String> tickets){
        HashMap<String , String> revTickets=new HashMap<>();//to->from
        for(String key:tickets.keySet()){
            revTickets.put(tickets.get(key),key);//value , key as new value
        }
        for(String key: tickets.keySet()){
            if(!revTickets.containsKey(key)){
                return key;//starting point
            }
        }
        return null;
    }
}
