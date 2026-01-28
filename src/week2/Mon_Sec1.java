package week2;
import java.util.Scanner;
public class Mon_Sec1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double root = in.nextInt();
//        double root = 25;
//        System.out.println(root);
//        int a = 4.0;
        double x = Math.sqrt(root);
//        System.out.println("3" + 5);
        System.out.println("the square root of " + root + " = " + x);
//        System.out.println("the square root of " + root + " = " + Math.sqrt(root));
    }
}
