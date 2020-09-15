import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // f - для всех проверенных a,
        //     a не делит n
        boolean f = true;
        int a = 2;
        while (a < n) {
            // f = f && (n % a != 0); // обновили f
            f &= (n % a != 0);
            a++;
        }

        if (f) {
            System.out.println("YES"); // n - простое
        } else {
            System.out.println("NO"); // n - составное
        }
    }
}
