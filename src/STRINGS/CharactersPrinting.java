package STRINGS;

//printing all the character of a string

public class CharactersPrinting {
    public static void main(String[] args) {
        String firstName="Reet";
        String lastName="Agarwal";
        String fullName=firstName+" "+lastName;
        printLetters(fullName);
    }

    static void printLetters(String str) {
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
}
