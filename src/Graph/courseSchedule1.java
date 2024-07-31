package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class courseSchedule1 {
    public boolean isPossible(int V,int[][] prerequisites){
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        int m= prerequisites.length;
        for(int i=0;i<m;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        int[] indegree=new int[V];
        for(int i=0;i<V;i++){
            for(int it:adj.get(i)){
                indegree[it]++;
            }
        }

        Queue<Integer> q=new LinkedList<Integer>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        List<Integer> topo=new ArrayList<Integer>();
        while(!q.isEmpty()){
            int node=q.peek();
            q.remove();
            topo.add(node);

            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }

        if(topo.size()==V){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int N = 4;
        int[][] prerequisites = new int[3][2];
        prerequisites[0][0] = 1;
        prerequisites[0][1] = 0;

        prerequisites[1][0] = 2;
        prerequisites[1][1] = 1;

        prerequisites[2][0] = 3;
        prerequisites[2][1] = 2;

        courseSchedule1 obj = new courseSchedule1();
        boolean ans = obj.isPossible(N, prerequisites);
        if (ans)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
