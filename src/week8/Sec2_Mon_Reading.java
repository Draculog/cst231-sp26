package week8;

import java.io.FileReader;
import java.util.Scanner;
public class Sec2_Mon_Reading {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src/week8/sec2.txt");
        Scanner fs = new Scanner(fr);

        int input = fs.nextInt();
        System.out.println(input);
        fr.close();
    }
}
