
import java.util.*;

// Документация по String (для Java 7):
// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

// Unicode

public class L19 {
    public static void main(String[] args) {
        String s = "Привет, café";
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int code = c;
            System.out.println(c + " " + code);
        }

        System.out.println(less("абажур","аббат"));
        System.out.println(less("аббат","аббатство"));
    }
    public static boolean less(String a, String b) {
        return false;
    }
}
