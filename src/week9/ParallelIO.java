package week9;

import java.io.*;
import java.util.*;

public class ParallelIO {
    public static void main(String[] args) throws Exception {
        String teamFile = "teamNames";
        String memberFile = "memberNames";

        FileWriter fTeam = new FileWriter("src/week9/" + teamFile);
        PrintWriter pTeam = new PrintWriter(fTeam);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter team name: ");
        String teamName = in.next();
        pTeam.println(teamName);

        fTeam.close();
    }
}
