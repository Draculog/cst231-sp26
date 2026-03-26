package week10;

import java.util.Scanner;

public class Sec1_Wed_Param {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number1 = getInteger(s);
//        System.out.println(number1);

        int number2 = getInteger(s);

        int product;
        product = multiply(number1, number2);
        System.out.println("Is " + product + "even? " + isEven(product));


    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static int getInteger(Scanner in) {
//        Scanner in = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        while(! in.hasNextInt()) {
            in.next();
            System.out.print("Enter a whole number: ");
        }
        int input = in.nextInt();
        return input;
    }
}
