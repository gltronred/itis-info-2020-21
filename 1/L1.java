// Следующие две строки - для использования Scanner
import java.io.*;
import java.util.*;

public class L1 {
    public static void main(String[] args) {
        // print - без переноса
        System.out.print("Hello ");
        // println - с переносом
        System.out.println("world!");
        System.out.println(345);

        // Выражения
        System.out.println(2*2);
        System.out.println(10/(2-1+1));
        System.out.println(9%2);  // 1 - остаток
        System.out.println(9/2);  // 4
        System.out.println(9.0/2);// 4.5

        // Переменные
        int a = 1;
        int b = a + 3; // 4
        int c;
        c = b * (a + a);
        System.out.println(c);

        // Типы переменных и неявные преобразования
        double f = 1.5;
        f = c;
        System.out.println(f);

        // Ввод с клавиатуры
        //
        // вспомогательное объявление, делается один раз
        Scanner sc = new Scanner(System.in);
        // дальше можно использовать sc.nextInt()
        // переменные a и b уже объявлены
        a = sc.nextInt();
        b = sc.nextInt();
        double d = sc.nextDouble(); // NB. Разделитель зависит от локали! (например, `1,2`)
        System.out.println(a + b);
    }
}
