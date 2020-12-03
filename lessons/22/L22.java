import java.util.*;
import java.util.regex.*;

public class L22 {
    public static void main(String[] args){
        Pattern p = Pattern.compile("(?<year>(\\d){4})(((?: )?)г\\.)");
        String[] arr = {
            "Прошлый, 2020 г., был не простой, а составной",
            "Документ составлен 1 марта 1995г.",
            "В 2010г. было высажено 1234 гриба, а в 2011 г. - 231 куст",
            "А здесь года нет"
        };
        for (String s : arr) {
            Matcher m = p.matcher(s);
            System.out.println(s + " - ");
            boolean b = false;
            while (m.find()) {
                b = true;
                for (int g = 0; g <= m.groupCount(); g++) {
                    System.out.println(g + " = \"" + m.group(g) + "\"");
                }
                System.out.println("year = " + m.group("year"));
            }
            if (!b) {
                System.out.println("NO MATCH");
            }
        }
    }
}
