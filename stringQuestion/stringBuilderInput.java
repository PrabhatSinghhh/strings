package stringQuestion;

import java.util.Scanner;

public class stringBuilderInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        int n = sb.length();
        System.out.println(n);

    }
}
