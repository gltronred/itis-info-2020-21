import java.util.*;
import java.util.regex.*;

public class L22 {
    public static void main(String[] args){
        Pattern p = Pattern.compile("");
        String[] arr = {
            "Прошлый, 2020 г., был непростой, а составной",
            "Документ составлен 1 марта 1995г.",
            "В 2010г. было высажено 1234 гриба, а в 2011 г. - 231 куст",
            "А здесь года нет"
        };
        for (String s : arr) {
            System.out.println(s + " - ");
        }
    }
}
