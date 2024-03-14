package stringQuestion;

public class insertAndDeleteCharAt {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("RAJPUT");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.append("worrier");
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);
        sb.insert(1,"p");
        System.out.println(sb);
        sb.insert(3, 9);
        System.out.println(sb);


    }
}
