import java.util.*;

public class L17 {
    public static void main(String[] args) {
       Chair c1 = new Chair(5);
       System.out.println(c1);
       ColorChair c2 = new ColorChair();
       System.out.println(c2);
       c2.setColor(255,255,255);
       System.out.println("Color of c2: " + c2.getColor());
    }
}
