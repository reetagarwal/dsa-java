package SecondDimensionalArray;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        spiralMatrix(arr);
    }

    static void spiralMatrix(int[][] arr) {
        int startRow=0,startCol=0,endRow=arr.length-1,endCol=arr[0].length-1;
        while(startRow<=endRow && startCol<=endCol){//while(true)
            //variable we will make row ko

            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(arr[startRow][j]+" ");
            }

            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(arr[i][endCol]+" ");
            }

            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                /*
                /special case-same thing not to print twice
                (whatever printing in right,not to be printed in left and
                 whatever is printed at the top not to be printed at the bottom
                 */
                if(startRow==endRow){
                    break;
                }
                System.out.print(arr[endRow][j]+" ");
            }

            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;//special case-same thing not to print twice
                }
                System.out.print(arr[i][startCol]);
            }
            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
}
