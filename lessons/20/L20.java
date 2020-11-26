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
            "Helló, világ - magyar",
            "One\u00a0two\u205fthree\u2000four"
        };
        for (String s : strings) {
            System.out.println(s);
            System.out.println("---------");
        }
    }
}
