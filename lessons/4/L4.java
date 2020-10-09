import java.util.Scanner;

public class L4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean f = false;
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int a = sc.nextInt();

            int sum = 0;
            for (int d = 1; d < a; d++) {
                if (a % d == 0) {
                    sum += d;
                }
            }
            // System.out.println(sum);

            f |= (a == sum);
        }

        if (f) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
