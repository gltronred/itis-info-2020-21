import java.util.*;

public class L20 {
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
            "Hello\u200bworld!",
            "Hello\u200cworld!",
            "Helló, világ - magyar", // three, if you check that word contains letters :)
            "One\u00a0two\u205fthree\u2000four" // three words - because Java thinks that \u00a0 (NBSP) is not whitespace
        };
        for (String s : strings) {
            System.out.println(s);
            System.out.println("---------");
        }
    }
}
