package week4;
import java.util.Scanner;
public class Wed_Sec2 {
    public static void main(String[] args) {
        int counter = 0;
        System.out.println("start");
        while (counter++ < 6) {
            System.out.print(counter + " ");
//            System.out.print(counter++ + " ");
//            counter++;
            // this is NOT the same as counter + 1
            // equivalent to counter = counter + 1
        }
        System.out.println();
        System.out.println("final value of counter: " + counter);
        System.out.println("stop");

        Scanner in = new Scanner(System.in);

        System.out.print("Please answer the question? (yes or no): ");
        String answer = in.next();

//        if(answer == "yes" || answer == "no") {
//        if(answer.equals("yes") || answer.equals("no")) {
//            System.out.println("that is a valid answer");
//        } else {
//            System.out.println("that is an invalid answer");
//        }
        while(! (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) ) {
            System.out.println("that is a invalid answer");
            System.out.print("Please answer the question? (yes or no): ");
            answer = in.next();

        }
        System.out.println("that is a valid answer");

    }
}
