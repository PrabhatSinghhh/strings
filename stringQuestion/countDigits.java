package stringQuestion;

import java.util.Scanner;
//Return the total number of digits in a number without
//using any loop.

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n= sc.nextInt();
        String s = Integer.toString(n);
        System.out.println(s);
        System.out.println(s.length());
    }
}
