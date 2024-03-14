package stringQuestion;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class maxValue {
    public static void main(String[] args) {
        String[] arr = {"9999", "78656", "76987"};
        String max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = max(max, arr[i]);
        }
        System.out.println(max);
    }

    public static String max(String a, String b) {
        String s = purify(a), t = purify(b);
        if (a.length() > b.length()) return a;
        if (a.length() < b.length()) return b;
        for (int i = 0; i < a.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (s.charAt(i) > t.charAt(i)) return a;
                else return b;
            }
        }
        if (a.length() >= b.length()) return a;
        else return b;
    }

    public static String purify(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') return s.substring(i);
        }

        return s;

    }
}