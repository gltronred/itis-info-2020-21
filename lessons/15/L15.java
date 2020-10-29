import java.util.*;

public class L15 {
    // Двоичный поиск элемента x в массиве a
    //
    // Возвращает индекс элемента, если он есть
    // и -1, если такого элемента нет
    public static int find(int[] a, int x) {
        return -1;
    }
    public static void main(String[] args) {
        test(new int[]{1,2,3,3,4,4,5,7,8},6,-1);
        test(new int[]{1,2,3,3,4,4,5,7,8},1,0);
        test(new int[]{1,2,3,3,4,4,5,7,8},3,2);
        test(new int[]{1,2,3,3,4,4,5,7,8},8,8);
        test(new int[]{1,2,3,3,4,4,5,7,8},-1,-1);
        test(new int[]{1,2,3,3,4,4,5,7,8},10,-1);
    }
    public static void test(int[] a, int x, int r) {
        int i = find(a,x);
        if (i == -1 && r == -1 ||
            i != -1 && a[i] == x && a[r] == x) {
            System.out.print("OK");
        } else {
            System.out.print("WA");
        }
        System.out.println(": " + Arrays.toString(a) + "; x=" + x + "; correct=" + r + "; your=" + i);
    }
}
