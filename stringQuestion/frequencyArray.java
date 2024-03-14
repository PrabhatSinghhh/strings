package stringQuestion;
//Given n strings consisting of lowercase English
//alphabets. Print the character that is occurring most
//number of times.

import java.util.Scanner;
public class frequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = (int) ch - 97;
            freq[idx]++;
        }

        // Find maximum frequency
        int maxFreq = -1;
        for (int i = 0; i < freq.length; i++) {
            maxFreq = Math.max(maxFreq, freq[i]);
        }

        // Print characters with maximum frequency
        System.out.println("Characters with maximum frequency:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == maxFreq) {
                char ch = (char) (i + 97);
                System.out.print(ch + " ");
            }
        }
    }
}
