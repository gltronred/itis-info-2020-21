import java.util.*;

public class L10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        boolean[] b = new boolean[n];
        int t = 0;
        while (t < n) {
            while (t < n && b[t]) {
                t++;
            }
            if (t < n) {
                while (!b[t]) {
                    b[t] = true;
                    System.out.print((t+1) + " ");
                    t = a[t]-1;
                }
                System.out.println();
            }
        }
    }
}
