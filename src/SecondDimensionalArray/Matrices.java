package SecondDimensionalArray;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        int[][] arr=new int[3][3];//3*3 matrix is created or 9 cells in total
        int n=arr.length;//(total number of rows)
        int m=arr[0].length;//(total number of column)
        Scanner in=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=in.nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        search(arr,5);
    }
    static int search(int[][] arr,int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    System.out.print("found at cell("+i+","+j+")");
                    return key;
                }
            }
        }
        System.out.println("key not found");
        return -1;
    }
}
