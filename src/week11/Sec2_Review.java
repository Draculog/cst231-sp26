package week11;

import java.io.*;
import java.util.*;

public class Sec2_Review {

    public static void main(String[] args) throws Exception {
//        FileWriter fw = new FileWriter("src/week11/foo2.txt");
//        PrintWriter pw = new PrintWriter(fw);
//
//        for(int i = 0;
//            i < 11;
//            i += 5) {
//            pw.println(i);
//        }
//        fw.close();

        FileReader fr = new FileReader("src/week11/bar.txt");
        Scanner fs = new Scanner(fr);

        while(fs.hasNext()) {
//            fs.next();
//            String s = fs. next();
//            System.out.println(s);
            int i = fs.nextInt();
        }


        fr.close();

    }
}
