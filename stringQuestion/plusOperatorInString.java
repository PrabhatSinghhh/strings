package stringQuestion;

public class plusOperatorInString {
    public static void main(String[] args) {
        String s = "xyz";
        String p = "abc";
        System.out.println(s+p);
        s = s+10;
        System.out.println(s);
        s = 10+20+"mno";
        System.out.println(s);
        s = "mno"+10+20;
        System.out.println(s);
    }
}
