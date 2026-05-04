package week15.sec1;

import java.util.Scanner;

public class SetMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set x = new Set();
        x.print();
        x.add(7);
        x.print();
        x.add(14);
        x.print();
        x.add(21);
        x.print();
        x.add(7);
        x.print();
        Set s2 = new Set();
        s2.print();
    }
}
