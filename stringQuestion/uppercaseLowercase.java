package stringQuestion;

import java.util.Scanner;
//toLowerCase() and toUppercase()
public class uppercaseLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to change into upper and lowercase");
        String s= sc.nextLine();
        System.out.println(s);
        System.out.println("All sentences are changed into lowercase: "+s.toLowerCase());
        System.out.println("All the sentences are changed into uppercase: "+s.toUpperCase());

    }
}
