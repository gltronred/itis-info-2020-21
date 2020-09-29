import java.util.*;

public class L7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int max = x;            // максимум
        int k = 0;              // их кол-во
        int max2 = x;           // второй по величине
        int k2 = 0;             // их кол-во
        while (x != -1) {
            if (x > max) {
                max2 = max;
                k2 = k;
                max = x;
                k = 1;
            } else if (x == max) {
                k++;
            } else if (x > max2 || k2 == 0) { // max > x
                max2 = x;
                k2 = 1;
            } else if (x == max2) {
                k2++;
            }
            x = sc.nextInt();
        }
        if (max == -1) {
            // элементов не было
            System.out.println("NO1");
        } else if (max == max2) {
            // нет второго по величине элемента
            System.out.println("NO2");
        } else {
            System.out.println(max2 + " " + k2);
        }
    }
}
