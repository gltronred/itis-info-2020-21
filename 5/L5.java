import java.util.Scanner;

public class L5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = 0;              // сумма
        boolean first = true;   // текущий элемент - первый
        int pred = 1;           // предыдущий элемент

        int a = sc.nextInt();   // начальное a
        while (a != -1) {
            if (!first) {
                s += pred * a;      // обновляем сумму,
                                    // если не первый элемент
            }
            first = false;      // дальше - не первый
            pred = a;           // обновляем предыдущий
            a = sc.nextInt();   // следующее a
        }

        System.out.println(s);
    }
}
