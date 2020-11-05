
import java.util.*;

public class L16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Say my name: " + Chair.getName());
        Chair chair1 = new Chair(3);
        Chair chair2 = new Chair(4);
        chair1.setArmRests(3);
        System.out.println("Hello world!");
        System.out.println(chair1);
        System.out.println(chair2);
        chair1.setArmRests(4);
        System.out.println(chair1);
        System.out.println(chair2);
        // Присваивания
        chair2 = chair1;
        System.out.println(chair2);
        // Вызовы методов
        chair2.addLeg();
        System.out.println(chair2);
        chair1.addMoreLegs(5);
        System.out.println("chair1 legs: " + chair1.getLegs());
    }
}
