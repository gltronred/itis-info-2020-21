import java.util.*;

public class L10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i=0; i<n; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[n];
        for (int i=0; i<n; i++) {
            c[i] = b[a[i]-1];
        }

        for (int i=0; i<n; i++) {
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }
}
