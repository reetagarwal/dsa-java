package Graph;

import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.*;
//using priority queue

class dijkstra{
    int distance;
    int node;

    public dijkstra(int distance, int node) {
        this.distance = distance;
        this.node = node;
    }
}
public class dijkstra1 {
    static int[] dijkstraAlgo(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj,int S){
        PriorityQueue<dijkstra> pq=new PriorityQueue<dijkstra>((x,y)->x.distance-y.distance);

        int[] dist=new int[V];

        //initialising everything as infinity
        for(int i=0;i<V;i++){
            dist[i]=(int)(1e9);
        }

        dist[S]=0;
        pq.add(new dijkstra(0,S));

        while(pq.size()!=0){
            int dis=pq.peek().distance;
            int node=pq.peek().node;
            pq.remove();

            for(int j=0;j<adj.get(node).size();j++){
                int edgeWeight=adj.get(node).get(j).get(1);
                int adjNode=adj.get(node).get(j).get(0);

                if(dis+edgeWeight<dist[adjNode]){
                    dist[adjNode]=dis+edgeWeight;
                    pq.add(new dijkstra(dist[adjNode],adjNode));
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) throws IOException {
        int V = 3, E=3,S=2;
        ArrayList<Integer> node1 = new ArrayList<Integer>() {{add(1);add(1);}};
        ArrayList<Integer> node2 = new ArrayList<Integer>() {{add(2);add(6);}};
        ArrayList<Integer> node3 = new ArrayList<Integer>() {{add(2);add(3);}};
        ArrayList<Integer> node4 = new ArrayList<Integer>() {{add(0);add(1);}};
        ArrayList<Integer> node5 = new ArrayList<Integer>() {{add(1);add(3);}};
        ArrayList<Integer> node6 = new ArrayList<Integer>() {{add(0);add(6);}};

        ArrayList<ArrayList<Integer>> inter1 = new ArrayList<ArrayList<Integer>>(){
            {
                add(node1);
                add(node2);
            }
        };
        ArrayList<ArrayList<Integer>> inter2 = new ArrayList<ArrayList<Integer>>(){
            {
                add(node3);
                add(node4);
            }
        };
        ArrayList<ArrayList<Integer>> inter3 = new ArrayList<ArrayList<Integer>>(){
            {
                add(node5);
                add(node6);
            }
        };
        ArrayList<ArrayList<ArrayList<Integer>>> adj= new ArrayList<ArrayList<ArrayList<Integer>>>(){
            {
                add(inter1); // for 1st node
                add(inter2); // for 2nd node
                add(inter3); // for 3rd node
            }
        };
        //add final values of adj here.
        dijkstra1 obj = new dijkstra1();
        int[] res= obj.dijkstraAlgo(V,adj,S);

        for(int i=0;i<V;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();

    }
}


