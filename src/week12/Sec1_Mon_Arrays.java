package week12;

import java.util.Scanner;

public class Sec1_Mon_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = getPositiveInt(in);
        System.out.println(size);
        int [] data = new int[size];
        for(int i = 0; i < data.length; i++) {
            data[i] = getPositiveInt(in);
        }

        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();

//        int [] evens = {-2, 0, 2, 4, 6, 8, 10};
//        System.out.println(evens[0]);
//        for(int i = 0; i < evens.length; i++) {
//            System.out.print(evens[i] + " ");
//        }
//        System.out.println();
    }

    public static int getPositiveInt(Scanner s) {
        int x;
        do {
            System.out.print("Enter a positive integer: ");
            x = s.nextInt();
        } while(x < 1);
        return x;
    }
}
