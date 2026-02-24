package week6;
import java.util.Scanner;
public class Mon_Sec2_EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 1;
//        System.out.print("Enter a whole number: ");
//        number = in.nextInt();
//        do {
//            System.out.print("Enter a whole number: ");
//            number = in.nextInt();
////        if(number % 2 == 1 || number % 2 == -1) {
//            if (number % 2 != 0) {
//                System.out.println("odd");
//            } else {
//                System.out.println("even");
//            }
//        } while(number != 0);

        while(number != 0) {
            System.out.print("Enter a whole number: ");
            number = in.nextInt();
            if (number % 2 != 0) {
                System.out.println("odd");
            } else {
                System.out.println("even");
            }
        }

    }
}
