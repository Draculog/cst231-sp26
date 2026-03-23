package week9;
import java.io.*;
import java.util.*;
public class ParallelIO_Sec2 {
    public static void main(String[] args) throws IOException {
        String teamFile = "teamNames_2";
        String memberFile = "memberNames_2";

        FileWriter fwTeam = new FileWriter("src/week9/" + teamFile);
        PrintWriter pwTeam = new PrintWriter(fwTeam);

        FileWriter fwMember = new FileWriter("src/week9/" + memberFile);
        PrintWriter pwMember = new PrintWriter(fwMember);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter team name (or 0 to stop): ");
        String team = in.next();
        while(! team.equals("0")) {
            pwTeam.println(team);
            System.out.print("Enter team size: ");
            int size = in.nextInt();
            pwTeam.println(size);
            for (int i = 0; i < size; i++) {
                System.out.print("Enter name for member " + (i + 1) + ": ");
                String name = in.next();
                pwMember.println(name);
            }
            System.out.print("Enter team name (or 0 to stop): ");
            team = in.next();
        }
//        pwTeam.println(team);


        fwTeam.close();
        fwMember.close();
    }
}
