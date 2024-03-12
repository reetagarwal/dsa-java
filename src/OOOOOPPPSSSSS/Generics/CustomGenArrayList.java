package OOOOOPPPSSSSS.Generics;

import java.util.Arrays;
import java.util.ArrayList;

public class CustomGenArrayList<T> {
    private Object[] data;//data is the instance variable
    private int DEFAULT_SIZE=10;
    private int size=0;//also working as index value

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize(){
        Object[] temp=new Object[data.length*2];

        //copy the current items in the new array
        for(int i=0;i< data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull() {
        return size== data.length;
    }

    public T remove(){

        //reducing the size by 1
        T removed=(T)(data[--size]);

        return removed;
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index,T value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenArrayList list=new CustomGenArrayList();
        CustomGenArrayList<Integer> list2=new CustomGenArrayList<>();
        for(int i=0;i<14;i++){
            list2.add((3*i));
        }
        System.out.println(list2);
    }
}


//you cannot create an instance of generic type