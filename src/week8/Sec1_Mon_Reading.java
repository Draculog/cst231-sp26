package week8;
import java.util.Scanner;
import java.io.FileReader;

public class Sec1_Mon_Reading {
    public static void main(String[] args) throws Exception {
        // src/week8/sec1.txt
        FileReader fr = new FileReader("src/week8/sec1.txt");

        Scanner fs = new Scanner(fr);
        int data = fs.nextInt();
        int data2 = fs.nextInt();
        int data3 = fs.nextInt();
        String data4 = fs.next();
        System.out.println(data4);
        System.out.println(data);

        fr.close();
    }
}
