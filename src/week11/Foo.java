package week11;
import java.io.*;
import java.util.*;
public class Foo {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("src/week11/bar.txt");
        Scanner fs = new Scanner(fr);
        int i = fs.nextInt();

        fr.close();


    }
}
