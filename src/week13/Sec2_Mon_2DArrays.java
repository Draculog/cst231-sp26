package week13;

import java.util.Random;

public class Sec2_Mon_2DArrays {
    public static void main(String[] args) {
        int [] x = new int[5];
        int [][] z = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [] w = z[0];
        w[1] = 5;
        print(z);
        System.out.println();
//        int [] y;
//        System.out.println(y);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        String [] names = {"Ann", "Sarah", "Jackie", "Roberto"};
        System.out.println(names.length);
        System.out.println(names[2]);
        System.out.println();

        int [][] arr2d = new int[2][7];
        System.out.println(x);
        System.out.println(names);
        System.out.println(arr2d.length);
        System.out.println(arr2d);
        System.out.println(arr2d[0]);
        print(arr2d);
        System.out.println();
        fillRandom(new Random(), arr2d);
        System.out.println();
        print(arr2d);
    }

    public static void fillRandom(Random rand, int [][] a) {
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
               a[r][c] = Math.abs(rand.nextInt() % 10);
            }
        }
    }

    private static void print(int[][] arr2d) {
        for (int r = 0; r < arr2d.length; r++) {
            for (int c = 0; c < arr2d[r].length; c++) {
                System.out.print(arr2d[r][c] + " ");
            }
            System.out.println();
        }

    }
}
