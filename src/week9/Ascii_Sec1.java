package week9;

public class Ascii_Sec1 {
    public static void main(String[] args) {
        char a = 72;
        System.out.println(a);
        a++;
        System.out.println(a);
        int b = a;
        System.out.println(a);
        System.out.println(b);
        System.out.println((char) b);
        String name = "Johnny";
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
//            System.out.println(i);
            System.out.print((char) (c + 10) + " ");
        }
        char e = 48;
        System.out.println(e);
        System.out.println();
    }
}
