package week15.sec1;
import java.io.*;
public class Review {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src/week15/sec1/example-output.txt");
        PrintWriter pw = new PrintWriter(fw);

//        fw.write("hello\n");
//        fw.println("hello");
        pw.println("1 2 3 ...");
        for(int i = 0; i < 10; i++) {
            pw.print(i + 1);
        }
        pw.println("hello");

        fw.close();
    }

     public static boolean linearSearch(String [] names, String search) {
        for (int i = 0; i < names.length; i++) {
//            if (search == names[i]) { // WRONG!
            if (search.equals(names[i])) {
                return true;
//            } else {
//                return false;
            }
        }
        return false;
     }

     public static boolean linearSearch(int [][] a, int search) {
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                if(a[row][col] == search) {
                    return true;
                }
            }
        }
         return false;
      }

//    public static PrintWriter openFile(String fileName) {
//        FileWriter fw = new FileWriter(fileName);
//    }
}
