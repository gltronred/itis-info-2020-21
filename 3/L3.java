import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Проверка условия "для всех ..."
        // F(n) = forall a in {2,...,n-1} (a не делит n)
        // F(n) = n - простое
        //
        // f - для всех проверенных a,
        //     a не делит n
        boolean f = true;
        int a = 2;
        while (a < n && f) {
            // f = f && (n % a != 0); // обновили f
            f &= (n % a != 0);
            a++;
        }

        // Проверка условия "существует ..."
        // G(n) = exists a in {2,...,n-1} (a делит n)
        // G(n) = n - составное
        //
        // g - существует проверенное b,
        //     b делит n
        boolean g = false;
        int b = 2;
        while (b < n && !g) {
            // g = g || (n % b == 0);
            g |= (n % b == 0);
            b++;
        }

        if (f) {
            System.out.println("YES"); // F(n)
        } else {
            System.out.println("NO"); // не F(n)
        }
        if (g) {
            System.out.println("YES"); // G(n)
        } else {
            System.out.println("NO"); // не G(n)
        }
    }
}
