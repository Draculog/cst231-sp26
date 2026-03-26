package week10;

import java.util.Scanner;

public class Sec2_Wed_ParamMethods {
    public static void main(String[] args) {
        int z;
//        System.out.println(getInteger());
//        Scanner s = new Scanner(System.in);
//        System.out.println(getInteger(s));
//        z = getInteger(s);
//        System.out.println(z);
        foo();
        foo(5);
        foo(5.0);
    }

//    public static void foo(int b) {
//        System.out.println("I'm another int method");
//    }

    public static void foo(int a) {
        System.out.println("I'm an int method");
    }

    public static void foo(double u) {
        System.out.println("I'm a double method");
    }

    public static void foo() {
        System.out.println("I don't take any parameters");
    }

    public static int getInteger(Scanner in) {
//        Scanner in = new Scanner(System.in);
        System.out.print("Enter a whole number: ");

        while(! in.hasNextInt()) {
            in.next();
            System.out.print("Enter a whole number: ");
        }

        int number = in.nextInt();
        return number;
    }

    public static int getIntegerOld() {
        int x = 5;
        return x;
//        return x * 1.0;
    }
}
