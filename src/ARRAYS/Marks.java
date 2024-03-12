package ARRAYS;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        //the below lines means initialisation and here the object is being created in the heap memory
        int[] marks=new int[100];//size we've taken 100,this is maximum we cannot exceed
        Scanner in=new Scanner(System.in);
        marks[0]=in.nextInt();//phy
        marks[1]=in.nextInt();//chem
        marks[2]=in.nextInt();//maths
        System.out.println("physics marks="+marks[0]);
        System.out.println("chemistry marks="+marks[1]);
        System.out.println("maths marks="+marks[2]);

        //updating value
        marks[2]=marks[2]+1;
        System.out.println("updated marks of maths="+marks[2]);

        //to calculate the percentage
        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage="+percentage);

        //to calculate the length of the array(in the form of an integer)
        System.out.println("length of array = "+ marks.length);
    }
}

//all the type in the array should be same
