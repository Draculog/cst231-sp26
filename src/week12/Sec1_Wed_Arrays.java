package week12;

import java.io.FileReader;
import java.util.Scanner;

public class Sec1_Wed_Arrays {
    public static void main(String[] args) throws Exception{
        int y = 7;
        System.out.println(y);
        setX(y);
        System.out.println(y);
        double [] u = {0.1, 0.2, 0.3};
        System.out.println(u[u.length - 1]);
        System.out.println("sum of array: " + sum(u));
        String [] n = new String[4];
        loadNames(n);
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
//        int x;
//        {
//            x = 5;
//        }
//        x = 6;
    }

    public static void loadNames(String [] names) throws Exception {
        FileReader fr = new FileReader("src/week12/names1.txt");
        Scanner fs = new Scanner(fr);
        int x = fs.nextInt();
        for(int i = 0; i < names.length; i++) {
            names[i] = fs.next();
        }

        fr.close();
    }

    public static void setX(int x) {
        x = 5;
    }

    public static double sum(double [] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i]; // sum + x[i]
        }
        return sum;
    }
}
