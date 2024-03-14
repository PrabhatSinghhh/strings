package stringQuestion;

import java.util.Scanner;

public class reverseStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        reverse (sb,0,6);
        System.out.println(sb);
    }
    public static void reverse(StringBuilder sb , int i, int j){
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++; j--;


        }
    }


}
