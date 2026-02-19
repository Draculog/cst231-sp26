package week5;
import java.util.*;
public class Wed_Sec2_Flowchart {
    public static void main(String[] args) {
        // number guessing game
        Random rng = new Random();
        int random = Math.abs(rng.nextInt()) % 10 + 1;
        System.out.println("random number: " + random);
        Scanner sc = new Scanner(System.in);
        int y = 0;
        int guess = 0;
        while(guess != random) {
            int x = 5;
            System.out.print("Enter a number 1-10: ");
            guess = sc.nextInt();
            if (guess == random) {
                System.out.println("correct");
                String s = "hello";
            } else if (guess > random) {
                System.out.println("too large");
            } else {
                System.out.println("too low");
            }
//            System.out.println(s);
        }
        y++;
//        x++;
    }
}
