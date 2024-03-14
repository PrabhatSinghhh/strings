package stringQuestion;
//indexOf() and compareTo()
public class indexOfAndCompareTo {
    public static void main(String[] args) {
        String str = "Prabhat singh is becoming a good coder day by day ";
        String s = " good luck for the future";
        System.out.println(str);
        System.out.println("Index of t is: "+str.indexOf('t'));
        System.out.println("last index of a is: "+str.lastIndexOf('a'));
        System.out.println(str.compareTo(s));
    }
}
