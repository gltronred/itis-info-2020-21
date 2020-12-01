import java.util.*;
import java.util.regex.*;

public class L21 {
    public static void main(String[] args) {
        // Pattern p = Pattern.compile("([Gg]\\.)+al!?|No");
        // Pattern p = Pattern.compile(".*\\bh.*");
        Pattern p = Pattern.compile("((g[o.]){2,3})");
        String[] arr = new String[]{
                "GoGoGoal!",
                "No",
                "gogogoal",
                "gugugual",
                "gog.gogogo",
                "gog.go",
                "gogo",
                "go",
                "g.G.g.al",
                "hello    world",
                "   hello world",
                "world,hello",
                "world\nhello",
                "123.456.789",
                "0,123",
                "0.1",
                "123.456",
                "1234.",
                "1234"
        };
        for (String s : arr) {
            Matcher m = p.matcher(s);
            System.out.print(s + ": " + m.matches());
            if (m.matches()) {
                    System.out.print(": " + m.group(1));
            }
            System.out.println();
        }
    }
}
