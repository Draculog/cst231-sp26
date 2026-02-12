package week4;

import java.util.Scanner;

public class Mon_Sec2 {
    public static void main(String[] args){
        String input;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 'hello' to quit: ");
        input = in.next();
        int tries = 0;
        while(!input.equalsIgnoreCase("hello")){
            System.out.print("Enter 'hello' to quit: ");
            input = in.next();
            tries++;
        }
        System.out.println("It tool you " + tries + " tries");

        int count = 0;
        while(count < 5){
            System.out.print(count + " ");
            count++; //count = count + 1;
        }
        System.out.println("Done");
        System.out.println("Final value of counter: " + count);
    }
}
