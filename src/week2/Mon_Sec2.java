package week2;
import java.util.Scanner;

public class Mon_Sec2 {
    public static void main(String[] args) {
        int x;
//        double X;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
//        double u = 25;
//        double u = in.nextInt();
        double u = in.nextDouble();
        System.out.println(u);
        Math.sqrt(u);
//        System.out.println(Math.sqrt(u));
        double square_root = Math.sqrt(u);
//        System.out.println(square_root);
        System.out.println("the square root of " + u + " = " + square_root);
        System.out.println(3 + 5);
        System.out.println("3" + "5");
        System.out.println("3" + 5);
        System.out.println(3 + "5");
        System.out.println(1 + (3 + "5"));

//        System.out.print("the square root of ");
//        System.out.println(u);
    }
}
