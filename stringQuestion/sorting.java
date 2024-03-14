package stringQuestion;
//inbuilt  sorting is not possible in string

import java.util.Arrays;

public class sorting {
    public static void main(String[] args){
        String s = "Prabhat";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for (char ele : ch){
            System.out.print(ele);
        }
        System.out.println();

        for (char ele : ch){
            System.out.print(ele);
        }
        System.out.println();

    }
}
