package STRINGS;

public class Compare {
    public static void main(String[] args) {
        String s1="Reet";
        String s2="Reet";
        String s3=new String("Reet");
        if(s1==s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(s1==s3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
