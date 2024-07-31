package Graph;

import java.util.LinkedList;
import java.util.Queue;

class Oranges{
    int row;
    int col;
    int time;

    public Oranges(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
    }
}
public class rottenOranges {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        Queue<Oranges> q=new LinkedList<>();

        int[][] vis = new int[n][m];
        int count_fresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Oranges(i,j,0));
                    vis[i][j]=2;
                }
                else {
                    vis[i][j]=0;
                }
                if(grid[i][j]==1){
                    count_fresh++;
                }
            }
        }

        int time=0;
        int[] drow={-1,0,+1,0};
        int[] dcol={0,+1,0,-1};
        int count=0;

        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().time;
            time=Math.max(time,t);
            q.remove();
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    q.add(new Oranges(nrow,ncol,t+1));
                    vis[nrow][ncol]=2;
                    count++;
                }
            }
        }
        if(count!=count_fresh){
            return -1;
        }
        return time;

    }
}
