package week11;
import java.io.*;
import java.util.*;
public class Sec1_Review {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("src/week11/foo.txt");
        PrintWriter pw = new PrintWriter(fw);

        for(int i = 0; i < 3; i++) {
            pw.println(i * 5);
        }

        fw.close();

        FileReader fr = new FileReader("src/week11/foo.txt");
        Scanner fs = new Scanner(fr);

        int lines = 0;
        while(fs.hasNext()) {
            System.out.println(fs.nextInt());
            int i = fs.nextInt();
//            String s = fs.next();
//            lines++;
        }
        System.out.println(lines);

        fr.close();
    }

    public static int getRandomNumberInRange(Random r, int upper) {
        int rand = Math.abs(r.nextInt()) % (upper + 1) ;
        return rand;
    }
    // SELECT
    // FROM
    // WHERE

}
