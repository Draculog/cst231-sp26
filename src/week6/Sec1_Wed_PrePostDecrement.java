package week6;

public class Sec1_Wed_PrePostDecrement {
    public static void main(String[] args) {
        int x = 5;
        while (x-- > 0) {
            System.out.print(x + " ");
        }

        System.out.println();
        int y = 5;
        while (--y > 0) {
            System.out.print(y + " ");
        }
        System.out.println();
    }
}
