package week8;

import java.io.*;
import java.util.Scanner;

public class Sec2_Wed_ReadWrite {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src/week8/sec2_wed_input.txt");
        FileWriter fw = new FileWriter("src/week8/sec2_wed_output.txt");

        Scanner fs = new Scanner(fr);
        PrintWriter pw = new PrintWriter(fw);

        int count = fs.nextInt();

        for (int i = 0; i < count; i++) {
            String word = fs.next();
//            System .out.println(word);
//            if (i % 2 == 1) {
            if (i % 2 != 0) {
                pw.println(word);
            }
        }

        fr.close();
        fw.close();
    }
}
