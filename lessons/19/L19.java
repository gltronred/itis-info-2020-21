
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
        // Пусть n - длина более короткой строки
        int n = a.length();
        if (n > b.length()) {
            n = b.length();
        }
        // Проходимся по всем "символам" строки
        for (int i = 0; i < n; i++) {
            // соответствующие символы не равны
            if (a.charAt(i) != b.charAt(i)) {
                return (a.charAt(i) < b.charAt(i));
            }
        }
        // Дошли до конца строки,
        // все символы были одинаковы.
        // Сравниваем длину
        return (a.length() < b.length());
    }
}
