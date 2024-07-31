package Graph;

import java.util.LinkedList;
import java.util.Queue;

class enclave{
      int first;
      int second;

      public enclave(int first, int second) {
            this.first = first;
            this.second = second;
      }
}
public class numberOfEnclaves {
      int numberOfEnclaves(int[][] grid){
            Queue<enclave> q=new LinkedList<enclave>();
            int n=grid.length;
            int m=grid[0].length;
            int vis[][]=new int[n][m];

            for(int i=0;i<n;i++){
                  for(int j=0;j<m;j++){
                        if(i==0 || j==0 || i==n-1 || i==m-1){
                              if(grid[i][j]==1){
                                    q.add(new enclave(i,j));
                                    vis[i][j]=1;
                              }
                        }
                  }
            }

            int delrow[] = {-1, 0, +1, 0};
            int delcol[] = {0, +1, +0, -1};

            while(!q.isEmpty()) {
                  int row = q.peek().first;
                  int col = q.peek().second;
                  q.remove();

                  // traverses all 4 directions
                  for (int i = 0; i < 4; i++) {
                        int nrow = row + delrow[i];
                        int ncol = col + delcol[i];
                        // check for valid coordinates and for land cell
                        if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                                && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
                              q.add(new enclave(nrow, ncol));
                              vis[nrow][ncol] = 1;
                        }
                  }
            }

            int count=0;
            for(int i=0;i<n;i++){
                  for(int j=0;j<m;j++){
                        if(grid[i][j]==1 && vis[i][j]==0){
                              count++;
                        }
                  }
            }
            return count;
      }

      public static void main(String[] args)
      {
            int grid[][] = {
                    {0, 0, 0, 0},
                    {1, 0, 1, 0},
                    {0, 1, 1, 0},
                    {0, 0, 0, 0}};

            numberOfEnclaves ob = new numberOfEnclaves();
            int ans = ob.numberOfEnclaves(grid);
            System.out.println(ans);
      }
}
