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
    }
}
