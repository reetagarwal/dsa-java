package SecondDimensionalArray;

public class OptimisedDiagonalSum {
    public static void main(String[] args) {
        int[][]arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagonalSum(arr));
    }

    static int diagonalSum(int[][] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];//primary diagonal
            if(i!=arr.length-1-i){//here arr.length-i-1 means j
                sum+=arr[i][arr.length-i-1];//secondary diagonal
            }

        }
        return sum;
    }
}
