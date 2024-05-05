package GREEDY_ALGO;

import jdk.dynalink.NamedOperation;

import java.beans.Introspector;
import java.util.*;
public class Coin {
    public static void main(String[] args) {
        Integer[] coins={1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins,Comparator.reverseOrder());

        int countOfCoins=0;
        int amt=590;
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amt){
                while (coins[i]<=amt){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amt-=coins[i];
                }
            }
        }
        System.out.println("total minimum coins used is :" +countOfCoins);

        for (int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+ " ");
        }

        System.out.println();
    }
}
