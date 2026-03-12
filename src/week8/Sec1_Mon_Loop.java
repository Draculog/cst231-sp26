package week8;
import java.io.FileReader;
import java.util.Scanner;
public class Sec1_Mon_Loop {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src/week8/numbers.txt");
        Scanner fs = new Scanner(fr);
        int sum = 0;
        while (fs.hasNextInt()) {
            int input;
            input = fs.nextInt();
            sum += input;
            // sum = sum + input;
        }

        fr.close();
        System.out.println(sum);
    }
}
