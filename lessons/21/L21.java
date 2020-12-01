import java.util.*;
import java.util.regex.*;

public class L21 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("Go*al");
        Matcher m = p.matcher("Gooooooal");
        System.out.println(m.matches());
    }
}
