package stringQuestion;
//Input a string and toggle all the characters of it.
//(Replace small case with capital case & vice versa)
import java.util.Scanner;
public class toggleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(ch);
            }
        }

        String toggledString = sb.toString();
        System.out.println("Toggled string: " + toggledString);
    }
}

