package HASHING;

import java.util.*;

class Happy {

    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappy(2));
    }
    public static boolean isHappy(int n) {
        HashMap<Integer , Integer> map=new HashMap<>();
        while(true){
            int s=sum(n);
            if(s==1)
                return true;
            if(map.containsKey(s))
                return false;
            else
                map.put(s,1);
            n=s;
        }
    }

    public static int sum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=Math.pow(rem,2);
            n=n/10;
        }
        return sum;
    }
}

