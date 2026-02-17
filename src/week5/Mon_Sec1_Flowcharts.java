package week5;

import java.util.Random;

public class Mon_Sec1_Flowcharts {
    public static void main(String[] args) {
        Random rand = new Random();
        int r = (Math.abs(rand.nextInt()) % 10) + 1;
        if (r > 5) {
            System.out.println("large");
        } else {
            System.out.println("small");
        }

        if (r > 5) {
            System.out.println("large");
        } else {
            if (r < 5) {
                System.out.println("small");
            }
        }

        if (r > 5) {
            System.out.println("large");
        } else if (r < 5) {
            System.out.println("small");
        }

//        if(r > 5) {
//            System.out.println("large");
//        }
//
//        System.out.println("small");
    }
}
