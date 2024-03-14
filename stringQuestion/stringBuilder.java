package stringQuestion;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("prabhat");
        System.out.println(sb.length());
        System.out.println(sb);
        StringBuilder x = new StringBuilder(10);
        System.out.println(x);
        System.out.println(x.length());
        System.out.println(x.capacity());
    }
}
