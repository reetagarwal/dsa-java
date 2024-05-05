package GREEDY_ALGO;

import java.util.*;
public class maxLengthChain {
    public static void main(String[] args) {
        int[][] pairs={{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

        int ans=1;
        int pairEnd=pairs[0][1];//last selected pair end

        for(int i=1;i< pairs.length;i++){
            if(pairs[i][0]>pairEnd){
                ans++;
                pairEnd=pairs[i][1];
            }
        }
        System.out.println("Maximum length of chain =" + ans);
    }
}
