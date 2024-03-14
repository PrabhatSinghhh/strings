package stringQuestion;
//contain() and starts with()
public class containsAndStartsWith {
    public static void main(String[] args) {
        String s = "how are you";
        System.out.println(s.contains("aloo"));
        System.out.println(s.contains("are"));
        System.out.println(s.startsWith("are"));
        System.out.println(s.startsWith("how "));
        System.out.println(s.endsWith("you"));
    }
}
