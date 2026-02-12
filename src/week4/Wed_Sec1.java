package week4;
import java.util.Scanner;
public class Wed_Sec1 {
    public static void main(String[] args) {
        int counter = 0;
        System.out.println("starting");
        while(++counter <= 10) {
//            System.out.print(counter++ + " "); // side effect
//            System.out.print(++counter + " "); // side effect
            System.out.print(counter + " ");
//            counter++;
            // NOT equivalent to counter + 1
            // equivalent to counter = counter + 1
        }
        System.out.println();
        System.out.println("final value for counter: " + counter);
        System.out.println("done");

        Scanner in = new Scanner(System.in);
        System.out.print("What is your choice? (yes or no): ");
        String answer = in.next();
        while(! (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) ) {
            System.out.println("unacceptable answer");
            System.out.print("What is your choice? (yes or no): ");
            answer = in.next();
        }

    }
}
