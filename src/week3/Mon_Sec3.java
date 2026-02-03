package week3;

import java.util.Random;

public class Mon_Sec3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int v1 = rand.nextInt();
        // range -(2^31) to 2^31 - 1
        int v2 = Math.abs(rand.nextInt());
        int a = 5;
        int b = a + 10;
        v2 = v2 % 10;
        // range 0 to 2^31 - 1
        int v3 = Math.abs(rand.nextInt()) % 10;
        // range 0 to 9
        int v4 = Math.abs(rand.nextInt()) % 10 + 1;
        System.out.println(v4);

        // code structure
        // control
        if (true) {
            System.out.println("hello");
        } else if (true) {
            System.out.println("goodbye");
        }
        System.out.println("done");

        if (true) { System.out.println("hola");}if (true) {System.out.println("bonjour");}

//        int whatHappens = Math.abs(Integer.MIN_VALUE);
//        System.out.println(whatHappens);
    }
}
