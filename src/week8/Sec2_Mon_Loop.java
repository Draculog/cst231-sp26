package week8;
import java.io.FileReader;
import java.util.Scanner;
public class Sec2_Mon_Loop {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src/week8/sec2_numbers.txt");
        Scanner fs = new Scanner(fr);

//        int input = fs.nextInt();
//        System.out.println(input);
        int sum = 0;
        while (fs.hasNextInt()) {
            int input = fs.nextInt();
            sum += input;
            // sum = sum + input;
//            if(fs.hasNextInt()) {
//                int input = fs.nextInt();
//                sum += input;
//                // sum = sum + input;
//            } else {
//                fs.next();
//            }
        }


        System.out.println("Sum: " + sum);

        fr.close();
    }
}
