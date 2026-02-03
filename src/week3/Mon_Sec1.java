package week3;
import java.util.Random;

public class Mon_Sec1 {
    public static void main(String[] args) {
        boolean var = 7 == 7.0;
        System.out.println(var);
        // code structure
        // control structure
        int a = 7;
        if(a == 7.0) {
            System.out.println("they're equal");
        } else {
            System.out.println("they're different");
        }

        if(false) {
            System.out.println("yes");
        }

        Random r = new Random();
        int x = Math.abs(r.nextInt()) % 10 + 1;
        // -(2^31) to 2^31 - 1
        // 0 to 2^31 - 1
        // 0 to 9
        // 1 to 10
        System.out.println(x);
        if(x > 5) {
            System.out.println("big");
        }

        if(Math.abs(r.nextInt()) % 10 + 1 > 5) {
            System.out.println("big");
        }
    }
}
