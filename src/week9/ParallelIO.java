package week9;

import java.io.*;
import java.util.*;

public class ParallelIO {
    public static void main(String[] args) throws Exception {
        String teamFile = "teamNames";
        String memberFile = "memberNames";

        FileWriter fTeam = new FileWriter("src/week9/" + teamFile);
        PrintWriter pTeam = new PrintWriter(fTeam);

        FileWriter fMember = new FileWriter("src/week9/" + memberFile);
        PrintWriter pMember = new PrintWriter(fMember);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter team name (0 to stop): ");
        String teamName = in.next();

        while(! teamName.equals("0")) {
            pTeam.println(teamName);
            System.out.print("Enter team size: ");
            int size = in.nextInt();
            pTeam.println(size);
            for (int i = 0; i < size; i++) {
                System.out.print("Enter team member " + (i + 1) + ": ");
                String member = in.next();
                pMember.println(member);
            }

            System.out.print("Enter team name (0 to stop): ");
            teamName = in.next();

        }

        fTeam.close();
        fMember.close();
    }
}
