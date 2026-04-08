package week11;

import java.util.Scanner;

public class Sec2_Mon_Arrays {
    public static void main(String[] args) {
        int x = 5;
//        x = 7;
        int y = 7;
        int size = 17;
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter array size: ");
//        size = in.nextInt();
        int [] arr1 = new int[size];
        System.out.println(arr1.length);
        System.out.println(args.length);
        arr1[0] = 22;
        arr1[1] = 33;
        arr1[2] = 44;
        System.out.println(arr1[0] + " " + arr1[1] + " " + arr1[2]);
        System.out.println(arr1[17]);
        int [] arr2 = {1, 2, 3, 4, 5};

//        size + 5;
//        {
//            int z = 9;
//        }

    }
}
