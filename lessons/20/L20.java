import java.util.*;

public class L20 {
    public static int countWords(String s) {
        boolean hadSpace = true;
        int count = 0;
        for (int i=0; i<s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) && hadSpace) {
                count++;
                hadSpace = false;
            }
            if (Character.isWhitespace(s.charAt(i))) {
                hadSpace = true;
            }
        }
        return count;
    }
    public static String dateToString(int yyyy, int mm, int dd) {
        StringBuilder sb = new StringBuilder();
        sb.append(dd);
        sb.append('.');
        if (mm < 10) {
            sb.append('0');
        }
        sb.append(mm);
        sb.append(".");
        sb.append(yyyy);
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] strings = {
            "Hello world",
            "Привет, мир",
            "Ещё\tпривет!",
            "   и\nещё\t\tприветик ",
            "",
            " ",
            "",
            "Thisisoneword",
            "Hello\u200bworld!", // one - \u200b is zero-width joiner
            "Hello\u200cworld!", // one
            "Helló, világ - magyar", // three, if you check that word contains letters :)
            "One\u00a0two\u205fthree\u2000four" // three words - because Java thinks that \u00a0 (NBSP) is not whitespace
        };
        for (String s : strings) {
            System.out.println(s);
            System.out.println("---------" + countWords(s));
        }
        System.out.println(dateToString(2020,11,26)); // "26.11.2020"
        System.out.println(dateToString(2020,6,1));   //  "1.06.2020"
        System.out.println(dateToString(2020,10,20)); // "20.10.2020"
    }
}
