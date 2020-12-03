import java.util.*;
import java.util.regex.*;

public class L22 {
    public static void main(String[] args){
        Pattern p = Pattern.compile("(\\d{4}) ?г\\.");
        String[] arr = {
            "Прошлый, 2020 г., был непростой, а составной",
            "Документ составлен 1 марта 1995г.",
            "В 2010г. было высажено 1234 гриба, а в 2011 г. - 231 куст",
            "А здесь года нет"
        };
        for (String s : arr) {
            Matcher m = p.matcher(s);
            System.out.print(s + " - ");
            if (m.find()) {
                System.out.println(m.group(1));
            } else {
                System.out.println("NO MATCH");
            }
        }
    }
}
