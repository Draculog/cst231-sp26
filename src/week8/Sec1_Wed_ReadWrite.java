package week8;
import java.io.*;
import java.util.Scanner;

public class Sec1_Wed_ReadWrite {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src/week8/sec1_wed_input.txt");
        FileWriter fw = new FileWriter("src/week8/sec1_wed_output.txt");

        Scanner fs = new Scanner(fr);
        PrintWriter pw = new PrintWriter(fw);

        int size = fs.nextInt();

//        System.out.println(size);

        for (int i = 0; i < size && fs.hasNext(); i++) {
            String word = fs.next();
//            System.out.println(word);
            if (i % 2 != 0) {
                pw.println(word);
            }
        }

        fr.close();
        fw.close();
    }
}
