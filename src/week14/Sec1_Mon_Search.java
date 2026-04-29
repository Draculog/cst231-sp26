package week14;

import java.util.Random;
import java.util.Scanner;

public class Sec1_Mon_Search {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = getPositiveInt(s);
        Random rand = new Random(-7);
        int [] array = generateArray(size, rand);
        print(array);

//        while(true) {
//            int input = getPositiveInt(s);
//            System.out.println("your positive int: " + input);
//            if (input > 0) {
//                break;
//            }
//        }
    }

    // return -1 if target not found
    // linear search
    public static int search(int [] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int search2(int [] data, int target) {
        int index = 0;
        while(index < data.length && data[index] == target) {
            index++;
        }
        return -1;
    }

    public static void print(int [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
//            a[i] = 0;
        }
        System.out.println();
    }

    public static int [] generateArray(int size, Random rand) {
        int [] data = new int[size];
        for (int i = 0; i < data.length; i++) {
            data[i] = Math.abs(rand.nextInt()) % 10 + 1;
        }
        return data;
    }


    public static int getPositiveInt(Scanner in) {
        int input = 0;
        do {
            System.out.print("Enter a positive number: ");
            input = in.nextInt();

        } while (input < 1);
        return input;
    }
}
