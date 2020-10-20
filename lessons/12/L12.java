import java.util.*;

public class L12 {
    // Циклический сдвиг массива a влево на k позиций
    // Меняется передаваемый массив a
    public static void cyclicShift(int[] a, int k) {
        int n = a.length;
        k %= n; // чтобы сдвиг всегда был меньше длины массива
                // иначе - ArrayIndexOutOfBounds в первом цикле
        int[] t = new int[k];
        for (int i = 0; i < k; i++) {
            t[i] = a[i];
        }
        for (int i = 0; i < n - k; i++) {
            a[i] = a[i+k];
        }
        for (int i = 0; i < k; i++) {
            a[n - k + i] = t[i];
        }
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
