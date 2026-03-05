package week7;
import java.util.Scanner;
public class Sec2_Wed_For {
    public static void main(String[] args) {

        int max = 5;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter size of square: ");
            max = in.nextInt();
        } while (max < 1);
//        int x = max * 3;
//        if(x = max) {
//
//        }
        for (int row = 0; row < max; row++) {
            for (int col = 0; col < max; col++) {
                // 0 1 2 3 4 5
                // - * - * - *
                if (col % 2 == 0) {
                    System.out.print("-");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int row = 0; row < max; row++) {
            for (int col = 0; col < max; col++) {
                if(row % 2 == 0) {
                    System.out.print("+");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }

        String s;
        for(int row = 0; row < max; row++) {
            if(row % 2 == 0) {
                s = "+";
            } else {
                s = "_";
            }

            for (int col = 0; col < max; col++) {
                System.out.print(s);
            }
            System.out.println();
        }

    }
}
