// !!! Содержит ошибки в некоторых частных случаях !!!
// Будьте внимательны!

import java.io.*;
import java.util.*;

public class L6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int min = x;            // минимальный элемент
        int max = x;            // максимальный элемент
        int sum_ob = 0;         // общая сумма (от минимума до конца)
        int sum_it = 0;         // итоговая сумма (от минимума до максимума)

        while (x != -1) {
            // обновляем общую сумму
            sum_ob += x;
            // обновляем минимум (и обнуляем общую сумму)
            if (x < min) {
                min = x;
                sum_ob = 0;
            }
            // обновляем максимум (и сохраняем общую сумму на данный момент как итоговую)
            if (x > max) {
                max = x;
                sum_it = sum_ob;
            }

            // ввод следующего элемента
            x = sc.nextInt();

            // отладочный вывод
            // System.out.println(min + " " + max + " " + sum_ob + " " + sum_it);
        }
        // Выводим итоговую сумму без минимума и максимума
        System.out.println(sum_it - min - max);
    }
}
