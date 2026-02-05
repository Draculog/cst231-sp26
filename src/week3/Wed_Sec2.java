package week3;

import java.util.Random;

public class Wed_Sec2 {
    public static void main(String[] args) {
        Random r = new Random(-7);
        int x = r.nextInt();
        System.out.println(x);
        x = Math.abs(x);
        System.out.println(x);
        x = x % 10;
        System.out.println(x);
        // code structure
        // control structure
        System.out.println("start");
        int a = 5;
//        if((a < 6) || (a > 3)) {
        if (false) {
            System.out.println("hello");
        } else if (true) {
            System.out.println("goodbye");
        }
        System.out.println("stop");

//        System.out.println(r.nextInt()%100);
//        System.out.println(r.nextInt()%100);
//        System.out.println(r.nextInt()%100);
//        System.out.println(r.nextInt()%100);
//        System.out.println(r.nextInt()%100);
//        System.out.println(r.nextInt()%100);
//        System.out.println(r.nextInt()%100);
    }
}
