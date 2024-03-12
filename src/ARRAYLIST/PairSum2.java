package ARRAYLIST;

import java.util.ArrayList;

public class PairSum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.println(Sum2(list,target));
    }

    public static boolean Sum2(ArrayList<Integer> list, int target) {
        int breakingPoint=-1;
        int n= list.size();
        for(int i=0;i< list.size();i++){
            if(list.get(i)> list.get(i+1)){//breaking point
                breakingPoint=i;
                break;
            }
        }

        int lp=breakingPoint+1;//smallest
        int rp=breakingPoint;//largest
        while(lp!=rp){

            //case 1:
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }

            //case 2:
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }

            //case 3:
            else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
}
