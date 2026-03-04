package week6;
import java.util.Scanner;
public class Sec2_Wed_Exam {
    public static void main(String[] args) {

        int x = 5;
        int y = x + 7;
        int z = -5;
        int a = +5;
        boolean b1 = true;
        boolean b2 = ! b1;
        boolean b3 = ! b2;

        String input = "";
        Scanner s = new Scanner(System.in);

        // yes
        // no
//        while(! (input.equals("yes") || input.equals("no"))) {
//        while(! input.equals("yes") && ! input.equals("no")) {
        while(! input.equals("yes") ||  input.equals("no")) {
            System.out.print("Enter yes or no to stop: ");
            input = s.next();
        }
        System.out.println("You entered " + input);
        System.out.println("done");

        // 1. create loop variable
//        while(/* 2. loop conditional (boolean expression) */) {
            // 3. body of the loop - code to repeat

            // 4. update
//        }
//
//        //
//        while() {
//            if() {
//
//            } else {
//
//            }
//        }
//        //
//
//        if() {
//
//        } else if () {
//
//        } else {
//
//        }
    }
}
