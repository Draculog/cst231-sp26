package week13;

import java.io.*;
import java.util.*;
public class Sec1_Wed_2DArrays {
    public static void main(String[] args) throws Exception {
//        decompress2("src/week13/data2.txt");
        int [][] a = {{1, 2, 3, 0}, {4, 5, 6, 0}, {1, 2, 3, 0}};
        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
            for(int k = 0; k < a[i].length; k++) {
                System.out.print( a[i][k] + " ");
            }
            System.out.println();
        }
//
//        for(char i = 48; i < 58; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        Scanner in = new Scanner(System.in);
//        int input = 0;
//        do {
//            System.out.print("Enter the digit to print: ");
//            input = in.nextInt();
//            char c = (char) (input + 48);
//            System.out.println(c);
//        } while(input != 0);
    }

    public static void sumEvensAndOdds(int [][] a) {
//        int evens = sumEvens(a);
//        int sum = sum(a);
//        int odds = sum - evens;
//        System.out.println(evens);
//        System.out.println(odds);
//        System.out.println(sum);
    }

    public static int sumEvens(int [][] a) {
        int sum = 0;
        for(int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                if(a[r][c] % 2 == 0) {
                    sum += a[r][c];
                }
            }
        }

        return sum;

    }

    public static void decompress2(String filename) throws Exception {
        FileReader fr = new FileReader(filename);
        Scanner in = new Scanner(fr);
        int count = in.nextInt();
        String symbol = " ";
        for (int i = 0; i < count; i++) {
            int repeats = in.nextInt();
//            System.out.println(repeats + " " + symbol);
            if (symbol.equals(" ")) {
                symbol = "+";
            } else {
                symbol = " ";
            }

            for (int k = 0; k < repeats; k++) {
                System.out.print(symbol);
            }
        }

        fr.close();
    }

    public static void decompress(String filename) throws Exception {
        FileReader fr = new FileReader(filename);
        Scanner in = new Scanner(fr);
        int count = in.nextInt();
        for (int i = 0; i < count; i++) {
            int repeats = in.nextInt();
            String symbol = in.next();
//            System.out.println(repeats + " " + symbol);
            for (int k = 0; k < repeats; k++) {
                System.out.print(symbol);
            }
        }


        fr.close();
    }
}
