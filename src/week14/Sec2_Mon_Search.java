package week14;

import java.util.Random;
import java.util.Scanner;

public class Sec2_Mon_Search {
    public static void main(String[] args) {
        int size = 10;
        Random rand = new Random(-7);
        int [] blah = generateNumbers(rand, size);
        print(blah);
        Scanner sc = new Scanner(System.in);
        int userNumber = getPositiveNumber(sc);
        int result = search(blah, userNumber);
        System.out.println(result);
    }

    public static int getPositiveNumber(Scanner s) {
        int input = 0;
        do {
            System.out.print("Enter a positive number: ");
            input = s.nextInt();
        } while (input < 1);
        return input;
    }

    // returns the index of searchValue in the array b,
    // or returns -1 if the searchValue is not in the array
    public static int search(int [] b, int searchValue) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }

    public static void print(int [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int [] generateNumbers(Random rand, int size) {
        int [] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.abs(rand.nextInt()) % 10 + 1;
        }
        return numbers;
    }
}
