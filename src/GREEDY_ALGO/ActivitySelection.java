package GREEDY_ALGO;

//assuming that end time is sorted
import java.util.*;
public class  ActivitySelection {//o(n)
    public static void main(String[] args) {
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};

        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();

        //first activity
        maxAct =1;
        ans.add(0);//adding the first activity since it will take the least time

        int lastEnd=end[0];//temporary variable to store the end time of the last chosen activity

        for(int i=1;i<end.length;i++){
            if(start[i]>=lastEnd){//disjoint condition
                //activity select
                maxAct++;
                ans.add(i);
                lastEnd=end[i];//updating the last end time activity chosen
            }
        }

        System.out.println("Max activites =" +maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
