package OOOOOPPPSSSSS.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;//data is the instance variable
    private int DEFAULT_SIZE=10;
    private int size=0;//also working as index value

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }
    
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize(){
        int[] temp=new int[data.length*2];

        //copy the current items in the new array
        for(int i=0;i< data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull() {
        return size== data.length;
    }

    public int remove(){

        //reducing the size by 1
        int removed=data[--size];

        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,int value){
        data[index]=value;
    }

    public String toString(){
        return "CustomArrayList{"+"data="+ Arrays.toString(data)+",size="+size+"}";
    }


    public static void main(String[] args) {
        CustomArrayList list=new CustomArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);

        for(int i=0;i<14;i++){
            list.add(2*i);
        }
        System.out.println(list);

//        ArrayList list=new ArrayList();
//        list.add(45);
//        list.remove(0);
//        list.get(0);
//        list.set(1,6789);
//        list.size();
//        list.isEmpty();

//        ArrayList<Integer> list2=new ArrayList<>();
//        list2.add("gfhtjt");
        //this is generics , which gives parameterized type
    }
}


//cannot directly change it , change it via methods only that is why private is used with int[]