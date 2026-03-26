package week10;

import java.util.Random;

public class Sec2_Mon {
    public static void main(String[] args) {
//        foo();
//        foo();
//        double x = bar();
//        int y = foo();
//        System.out.println(x);
//        int z = bar();
//        int a = bar();

        int r = generateRandomNumber();
        System.out.println(r);
        r = generateRandomNumber();
        System.out.println(r);

    }

    public static int abs() {
        return 0;
    }

    public static int generateRandomNumber() {
        Random r = new Random(-7);
//        for(int i = 0; i < 10; i++) {
//
//        }
        int x = Math.abs(r.nextInt()) % 10 + 1;
        return x;
    }

    public static int bar() {
        Random r = new Random();
        int randomNumber = r.nextInt();
        System.out.println(randomNumber);
//        foo();
        return randomNumber;
    }

    public static void foo() {
        System.out.println("hello, I'm a method");
        bar();
//        foo();
    }
}
