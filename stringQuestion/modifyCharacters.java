package stringQuestion;

public class modifyCharacters {
    public static void main(String[] args) {
        String s = "india";
        // change i into I
        //2 index change to capital I
        s = s.substring(0,2)+ "I"+ s.substring(3);
        System.out.println(s);

    }
}
