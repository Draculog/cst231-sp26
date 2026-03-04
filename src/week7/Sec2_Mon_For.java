package week7;
import java.util.Scanner;
public class Sec2_Mon_For {
    public static void main(String[] args) {
        int x = 5;
        x = 6;
        int y;
//        System.out.println(y);
//        while(x = 0) {
//            System.out.println(x);
//            x++;
//        }
        int counter1 = 0;
        while(counter1 < 5) {
            System.out.print(counter1 + " ");
            counter1++;
        }
        System.out.println();
        System.out.println("The final value of counter1: " + counter1);

        int counter2;
        for(counter2 = 0; counter2 < 5; counter2++) {
            System.out.print(counter2 + " ");
        }

        System.out.println("The final value of counter2: " + counter2);

//        Scanner in = new Scanner(System.in);
//        String input = "";
//        for(;! input.equals("stop"); input = in.next()) {
//            System.out.print("Enter stop to stop: ");
//        }
        for(int k = 0; k < 4; k++) {
            for (int i = 0; i < 7; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println("done");
//        y = 7;
//        {
//            int z = 5;
//        }
//
//        {
//            int z = 6;
//        }

    }
}
