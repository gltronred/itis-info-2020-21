import java.util.*;

public class L9 {
    public static void main(String[] args) {
        int[][] a = new int[3][];
        for (int i=0; i<3; i++) {
            a[i] = new int[2*i+1];
            for (int j=0; j<a[i].length; j++) {
                a[i][j] = i+j+1;
            }
        }

        System.out.println(a.length + ": ");
        for(int i=0; i<3; i++) {
            System.out.print(a[i].length + ": ");
            for(int j=0; j<2*i+1; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
