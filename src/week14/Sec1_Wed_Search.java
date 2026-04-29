package week14;

import java.util.Random;
import java.util.Scanner;

public class Sec1_Wed_Search {
    public static void main(String[] args) {
        int size = 10;
        Random rand = new Random(7);
        int [] data = generateNumbers(rand, size);
        printArray(data);
        int highest = getHighestValue(data);
        System.out.println(highest);

//        int [] b = {0, 5, 10, 15, 20, 25};
//        printArray(b);
    }



    public static int getHighestValue(int [] a) {
        int highest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > highest) {
                highest = a[i];
            }
        }
        return highest;
    }

    public static int [] generateNumbers(Random rand, int size) {
        int [] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.abs(rand.nextInt()) % 10 + 1;
        }
        return numbers;
    }

    private static void example2DArray() {
        Scanner in = new Scanner(System.in);
        int [][] a = {{1, 2},
                      {3, 4},
                      {in.nextInt(), in.nextInt()}};
        System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            int [] row = a[i];
//            System.out.print(row.length + " " + a[i].length + ": ");
//            printArray(row);
            printArray(a[i]);
        }
    }

    private static void printArray(int[] row) {
        System.out.print(row.length + ": ");
        for (int k = 0; k < row.length; k++) {
            System.out.print(row[k] + " ");
        }
        System.out.println();
    }
}
