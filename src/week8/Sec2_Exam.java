package week8;

import java.util.*;

public class Sec2_Exam {
    public static void main(String[] args) {
        Random rand = new Random();

        int add1 = Math.abs(rand.nextInt()%10) + 1;
        int add2 = Math.abs(rand.nextInt()%10) + 1;
        int sum = add1 + add2;
        int answer = 0;
        int tries = 0;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Solve " + add1 + "+ __ = " + sum);
            answer = in.nextInt();
            tries++;
            if (answer > add2) {
                System.out.println("too high");
            } else if(answer < add2) {
                System.out.println("too low");
            }
        } while (answer != add2);

        System.out.println("took " + tries + " tries");

        if(tries > 2) {
            System.out.println("took too many tries");
        }


    }
}
