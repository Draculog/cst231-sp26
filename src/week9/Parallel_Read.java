package week9;
import java.io.*;
import java.util.*;
public class Parallel_Read {
    public static void main(String[] args) throws IOException {
        String teamFile = "teamNames_2";
        String memberFile = "memberNames_2";
        FileReader frTeam = new FileReader("src/week9/" + teamFile);
        Scanner ts = new Scanner(frTeam);

        String teamName = ts.next();
        int teamSize = ts.nextInt();
        System.out.println(teamName + " " + teamSize);

        frTeam.close();
    }
}
