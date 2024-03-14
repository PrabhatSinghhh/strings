package stringQuestion;

import java.util.Scanner;

public class stringInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //System.out.print("use of sc.next() it take one word as input: ");
        //String x = sc.next();
        //System.out.println(x);
        System.out.println(" use of sc.nextLine() it take sentence as a input: ");
        String p= sc.nextLine();
        System.out.println(p);
    }
}
