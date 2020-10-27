import java.util.*;

public class L14 {
    public static void main(String[] args) {
        int[] a = new int[]{5,4,3,3,2,1};
        insertion(a);
        System.out.println(Arrays.toString(a));

        int[] b = new int[]{5,4,3,3,2,1};
        selection(b);
        System.out.println(Arrays.toString(b));
    }

    public static void insertion(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int t = a[i];
            int j = i;
            while (j > 0 && a[j-1] >= t) {
                a[j] = a[j-1];
                j--;
            }
            a[j] = t;
        }
    }

    public static void selection(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            int imin = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[imin]) {
                    imin = j;
                }
            }
            int t = a[i];
            a[i] = a[imin];
            a[imin] = t;
        }
    }
}
