package ARRAYS;

public class Largest {
    public static int largest(int numbers[]) {
        int largest=Integer.MIN_VALUE;//-infinity
        int smallest=Integer.MAX_VALUE;//+infinity
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,6,3};
        System.out.println(largest(numbers));
    }
}
