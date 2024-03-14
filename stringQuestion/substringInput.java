package stringQuestion;

import java.util.Scanner;

public class substringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        String s = sc.nextLine();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                System.out.print(s.substring(i,j)+" ");


            }

        }
    }
}
