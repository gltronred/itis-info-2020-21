import java.util.*;

public class L12 {
    public static void cyclicShift(int[] a, int k) {
        // Implement me!!!
    }
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }
        System.out.println("initial: " + Arrays.toString(a));

        cyclicShift(a, 3);
        System.out.println("shifted: " + Arrays.toString(a));
    }
}
