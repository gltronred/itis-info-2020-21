import java.util.Scanner;

public class L8 {
    public static void main(String[] args) {
        //// args - аргументы, которые передаются в командной строке
        //// System.out.println(args.length);
        //// System.out.println(args[0]);
        //// java L8 123 -> выдаёт 1 и 123

        //int scalar;
        //scalar = 123;

        //int[] array;
        //array = new int[10];
        //for(int i = 0; i<10; i++) {
        //    array[i] = 2*i+1;
        //}

        //for(int i=0; i<10; i++) {
        //    System.out.println("a[" + i + "]=" + array[i]);
        //}

        //for(int i=9; i>=0; i--) {
        //    System.out.println("a[" + i + "]=" + array[i]);
        //}

        ////// !!! ERROR !!!
        ////// Выдаёт ArrayIndexOutOfBoundsException
        //// System.out.println("a[-1] = " + array[-1]);
        //// System.out.println("a[10] = " + array[10]);

        ////// !!! НЕ ТО, ЧТО КАЖЕТСЯ !!!
        ////// Выдаёт адрес, а не содержимое
        //// System.out.println(array);

        //// Вводится число N (от 0 до 2_000_000_000)
        //// Заполнить массив цифрами числа N в обратном порядке
        //// Вывести через пробел элементы этого массива
        //// (т.е. цифры числа в обратном порядке)
        //// Например, для N = 2048 массив будет
        //// a[0] = 8
        //// a[1] = 4
        //// a[2] = 0
        //// a[3] = 2
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //int[] a = new int[10];
        //int k = 0;
        //while (n > 0) {
        //    a[k] = n % 10;
        //    n /= 10;
        //    k++;
        //}
        //if (k == 0) {
        //    k = 1;              // n было равно 0
        //}
        //for (int i=0; i<k; i++) {
        //    System.out.print(a[i] + " ");
        //}
        //System.out.println();

        // Решето Эратосфена
        //
        // Вводится число N
        // Вывести все простые числа строго меньше N

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] comp = new boolean[n];
        // все элементы равны false
        comp[0] = true;
        comp[1] = true;
        for (int p = 2; p < n; p++) {
            if (!comp[p]) {
                // p - простое
                for (int i = p*2; i<n; i+=p) {
                    comp[i] = true; // вычёркиваем
                }
            }
        }

        for (int i=0; i<n; i++) {
            if (!comp[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
