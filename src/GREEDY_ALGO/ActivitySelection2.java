package GREEDY_ALGO;

import java.util.*;
public class ActivitySelection2 {
    public static void main(String[] args) {
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};

        int[][] activities=new int[start.length][3];
        for(int i=0;i< start.length;i++){
            activities[i][0]=i;//index
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }

        //lamda function->shortform
        Arrays.sort(activities,Comparator.comparingDouble(o ->o[2]));//we wrote 2 here because we want it sorted according to end time

        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();

        //first activity
        maxAct =1;
        ans.add(activities[0][0]);//adding the first activity since it will take the least time

        int lastEnd=activities[0][2];//temporary variable to store the end time of the last chosen activity

        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){//activities[i][1] means start time>=lastEnd which is the disjoint condition
                //activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];//updating the last end time activity chosen
            }
        }

        System.out.println("Max activites =" +maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
