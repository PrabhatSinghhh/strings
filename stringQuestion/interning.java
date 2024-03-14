package stringQuestion;
public class interning {
    public static void main(String[] args) {
        String s = "prabhat";
        String p = "singh";
        String m = "rajput";
        System.out.println(s);
        System.out.println(p);
        System.out.println(m);
        String a = new String("prabhat");
        System.out.println(a);

    }
}
