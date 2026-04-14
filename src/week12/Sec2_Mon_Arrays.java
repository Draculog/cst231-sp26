package week12;

import java.util.Scanner;

public class Sec2_Mon_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = getPositiveInt(in);
        System.out.println(size);
        int [] data = new int[size];
        for (int i = 0; i < data.length; i++) {
            data[i] = getPositiveInt(in);
        }
        print(data);
//        int x = 5;
//        x = 7;
//        int [] evens = {-2, 0, 2, 4, 6, 8};
//        System.out.println(evens[0]);
//        evens[0] = -3;
//        System.out.println(evens[0]);
////        evens.length = 10;
//        for (int i = 0; i < evens.length; i++) {
//            System.out.print(evens[i] + " ");
//        }
//        System.out.println();
    }

    public static int [] copy(int [] src) {
        int [] copy = new int[src.length];
        // loop and copy from src to copy
        return copy;
    }

    public static void print(int []  a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int getPositiveInt(Scanner s) {
        int number;
        do {
            System.out.print("Enter a positive integer: ");
            number = s.nextInt();
        } while(number < 1);

        return number;
    }


}
