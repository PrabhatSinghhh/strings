package stringQuestion;

import java.util.Scanner;

//Input a string and Update all the even positions in the
//string to character ‘a’. Consider 0-based indexing.
public class updation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String s = sc.nextLine();
        String str = " ";
        for (int i = 0; i < s.length(); i++) {
            if (i%2==0)  str += "a";
            else str += s.charAt(i);
        }
        System.out.println(str);

    }
}
