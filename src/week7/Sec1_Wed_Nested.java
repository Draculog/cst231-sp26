package week7;

import java.util.Scanner;

public class Sec1_Wed_Nested {
    public static void main(String[] args) {
        int max = 4;

        Scanner in = new Scanner(System.in);
//        System.out.print("Enter size of square: ");
//        max = in.nextInt();
        for (int k = 0; k < max; k++) {
            // start of drawing line
            for (int i = 0; i < max; i++) {
//                System.out.print("-");
                // 0 2 4 6
                // - - - -
                // 1 3 5 7
                // * * * *
                if (i % 2 == 0) {
                    System.out.print("-");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            // end of drawing line
        }

        String s = "-";
        for (int i = 0; i < max; i++) {

            if(i % 2 == 0) {
                // print -
                s = "-";
            } else {
                // print +
                s = "+";
            }
            for (int k = 0; k < max; k++) {

                System.out.print(s);
//                if(i % 2 == 0) {
//                    System.out.print("-");
//                } else {
//                    System.out.print("+");
//                }
            }
            System.out.println();
        }
    }
}
