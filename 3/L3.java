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
            if (n % a == 0) {
                f = false;
            }
            a++;
        }

        if (f) {
            System.out.println("YES"); // n - простое
        } else {
            System.out.println("NO"); // n - составное
        }
    }
}
