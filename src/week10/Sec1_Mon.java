package week10;

import java.util.Random;

public class Sec1_Mon {
    public static void main(String[] args) {
        int x = bar();
//        bar();
//        int _1Uu76Uuu = 5;
//        String name1;
//        String _name1;
//
//        4 * 2;
//        int y = 7;
//        int z = foo();
//        foo();
//        foo();
    }

    public static int generateRandomNumber() {
        Random r = new Random();
        for(int i = 0; i < 10; i++) {

        }
        int randomNumber = Math.abs(r.nextInt()) % 10 + 1;
        return randomNumber;
    }

    public static int bar() {
        double u = 5.0;
        System.out.println(u);
        Random r = new Random();
        foo();
//        return 2;
//        return r.nextInt();
        int x = r.nextInt();
//        return (int) u;
        return x;
    }

    public static void foo() {
        System.out.println("I'm a method");
//        foo();
    }
}
