package week5;
import java.util.Random;
public class Mon_Sec2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int r = (Math.abs(rand.nextInt()) % 10) + 1;
//        if(r > 5) {
//            System.out.println("big");
//        } else {
//            System.out.println("small");
//        }
        if(r > 5) {
            System.out.println("big");
        } else if(r < 5) {
            System.out.println("small");
        } else {
            System.out.println("done");
        }

        if(r > 5) {
            System.out.println("big");
        } else {
            if(r < 5) {
                System.out.println("small");
            } else {
                System.out.println("done");
            }
        }

        if(r > 5) {
            System.out.println("big");
        } else {
            System.out.println("small");
        }

        System.out.println("done q");
    }
}
