import java.util.*;

public class L12 {
    public static void change0(int n) {
        n++;
        System.out.println("inside: " + n);
    }
    public static void change1(int[] a) {
        for (int i = 0; i < 10; i++) {
            a[i] = 10 - i;
        }
    }
    public static void change2(int[] a) {
        a = new int[5];
        for (int i = 0; i<5; i++) {
            a[i] = i*i;
        }
        System.out.println("inside 2: " + Arrays.toString(a));
    }
    public static void main(String[] args) {
        int n = 123;
        System.out.println("before: " + n);
        change0(n);
        System.out.println("after: " + n);

        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }
        System.out.println("initial: " + Arrays.toString(a));

        change1(a);
        System.out.println("after 1: " + Arrays.toString(a));

        change2(a);
        System.out.println("after 2: " + Arrays.toString(a));
    }
}
