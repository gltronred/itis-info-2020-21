import java.util.*;

public class L9 {
    public static void main(String[] args) {
        // int[][] a = new int[3][];
        // for (int i=0; i<3; i++) {
        //     a[i] = new int[2*i+1];
        //     for (int j=0; j<a[i].length; j++) {
        //         a[i][j] = i+j+1;
        //     }
        // }

        // System.out.println(a.length + ": ");
        // for(int i=0; i<3; i++) {
        //     System.out.print(a[i].length + ": ");
        //     for(int j=0; j<2*i+1; j++) {
        //         System.out.print(a[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        /*
         * Вводится число N
         * Вводится N строк:
         * - в первой строке N чисел
         *   (N-1 коэффициент a_{1,j+1} и b_1)
         * - во второй - N-1 число
         *   (N-2 коэффициента a_{2,j+2} и b_2)
         * ...
         * - в (N-1)-й - джва числа (a_{n-1,n} и b_{n-1})
         * - в N-й - одно число (b_n)
         *
         * Решить систему уравнений (вывести массив из x_i)
         *
         * 3
         * 2 3 11
         *   5 7
         *     1
         * означает систему уравнений
         * x1 + 2 x2 + 3 x3 = 11
         *        x2 + 5 x3 = 7
         *               x3 = 1
         * и её решение
         * 4 2 1
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int[] b = new int[n];

        for (int i=0; i<n; i++) {
            a[i][i] = 1;
            for (int j=i+1; j<n; j++) {
                a[i][j] = sc.nextInt();
            }
            b[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" = " + b[i]);
        }

        int[] x = new int[n];
        for (int i=n-1; i>=0; i--) {
            x[i] = b[i];
            for (int j=i+1; j<n; j++) {
                x[i] -= a[i][j] * x[j];
            }
        }

        for (int i=0; i<n; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}
