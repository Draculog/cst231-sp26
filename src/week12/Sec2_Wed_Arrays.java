package week12;

import java.util.Scanner;

public class Sec2_Wed_Arrays {
    public static void main(String[] args) {
        int y = 5;
        System.out.println(y);
        set(y);
        System.out.println(y);

        int [] arr = new int[10];
        double [] u = {0.1, 0.2, 0.3};
        System.out.println(u[u.length - 1]);
        System.out.println(u.length);
        System.out.println(sum(u));

        String [] n = new String[3];
        Scanner in = new Scanner(System.in);
        enterNames(in, n);
        for(int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }

    public static void set(int x) {
        x = 7;
    }

    public static void enterNames(Scanner in, String [] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name: ");
            names[i] = in.next();
        }
    }

    public static double sum(double [] a) {
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        return sum;
    }
}
