import java.io.*;
import java.util.*;

public class L2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Известное количество повторений
        //       +---------------- инициализация
        //       |        +------- условие
        //       |        |    +-- увеличение на 1
        //       v        v    v
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // Здесь i не видна! Ошибка компиляции
        //System.out.println(i);

        // Цикл while (цикл с предусловием)

        // 3x+1
        int x = sc.nextInt();
        while (x != 1) {
            System.out.print(x + " ");
            if (x % 2 == 0) {
                x = x/2;
            } else {
                x = 3*x+1;
            }
        }
        System.out.println("");

        // Цикл с постусловием

        x = sc.nextInt();
        do {
            System.out.print(x + " ");
            if (x % 2 == 0) {
                x = x/2;
            } else {
                x = 3*x+1;
            }
        } while (x != 1);
        System.out.println("");


    }
}
