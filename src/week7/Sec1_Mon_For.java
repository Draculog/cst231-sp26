package week7;
import java.util.Scanner;
public class Sec1_Mon_For {
    public static void main(String[] args) {
//        int y = (int x = 5);

//        while(true) {
//            System.out.println("ate");
//        }
//
//        if(true) {
//            System.out.println("goodbye");
//        }
        int x = 5;
        int counter = 0;
        while(counter < x) {
            System.out.print(counter++ + " ");
        }
        System.out.println(counter);
        for(int counter2 = 0; counter2 < x; counter2++) {
            System.out.print(counter2 + " ");
        }
//        System.out.println(counter2);

        // *** DON'T DO THIS! ***
        Scanner in = new Scanner(System.in);
        String input = "";
        for(;! input.equals("stop"); input = in.next()) {
            System.out.print("Enter stop to stop: ");
        }
        // *** DON'T DO THIS! ***
     }
}
