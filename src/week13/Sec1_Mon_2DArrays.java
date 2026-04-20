package week13;

import java.util.Random;

public class Sec1_Mon_2DArrays {
    public static void main(String[] args) {
        int [] x = new int[5];
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        System.out.println(x);

        int [][] arr2d = new int[4][3];
        for (int i = 0; i < arr2d.length; i++) {
            System.out.println(arr2d[i]);
        }

        System.out.println();
        print(arr2d);
        fill(new Random(), arr2d);
        System.out.println();
        print(arr2d);

    }

    public static void fill(Random rand, int [][] a) {
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                a[c][r] = Math.abs(rand.nextInt() % 10);
            }
        }
    }

    private static void print(int[][] arr2d) {
        for(int r = 0; r < arr2d.length; r++) {
            for (int c = 0; c < arr2d[r].length; c++) {
                System.out.print(arr2d[r][c] + " ");
            }
            System.out.println();
        }
    }
}
