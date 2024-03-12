package ARRAYS;

public class FunctionArguement {
    public static void update(int marks[]) {//square bracket shows that array is declared
        for(int i=0;i<marks.length;i++){//this loop shows the traversal of every index of array starting from 0-length
            marks[i]=marks[i]+1;//updation
        }

    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        update(marks);

        //print our marks
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }


//    public static void update(int marks[],int nonchangeable) {
//        nonchangeable=10;
//        for(int i=0;i<marks.length;i++){
//            marks[i]=marks[i]+1;
//        }
//
//    }
//    public static void main(String[] args) {
//        int marks[]={97,98,99};
//        int nonchangeable=5;
//        update(marks,nonchangeable);
//        System.out.println(nonchangeable);//now this would give 5 instead of 10(functions concept-prev chap)
//
//        //print our marks
//        for(int i=0;i<marks.length;i++){
//            System.out.println(marks[i]+" ");
//        }
//        System.out.println();
//    }

}
