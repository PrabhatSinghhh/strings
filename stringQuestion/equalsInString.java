package stringQuestion;

public class equalsInString {
    public static void main(String[] args) {
        String s = "abcxyz ";
        String a = " xyzabc";
        String b = new String(s);
        System.out.println(a==b);
        System.out.println(s.equals(b));

    }
}
