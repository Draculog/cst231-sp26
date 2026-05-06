package week15.sec3;

public class SetMain {
    public static void main(String[] args) {
        Set s1 = new Set();
        s1.print();
        s1.add(5);
        s1.print();
        s1.add(16);
        s1.print();
        s1.add(1);
        s1.print();
        s1.add(5);
        s1.print();

        Set s2 = new Set();
        s2.add(7);
        s2.add(14);
        s2.add(14);
        s2.print();

        s1.print();
    }
}
