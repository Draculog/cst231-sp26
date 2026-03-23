package week9;

public class Ascii_Sec2 {
    public static void main(String[] args) {
        char a = 65;
        char b = 'A';
        char newline = '\n';
        int c = 'A';
        char f = (char) c;
        int d = 9;
        int e = d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        a++;
        b--;
        System.out.println(a + " " + b);
        String word = "hello";
        for (int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);
            x++;
            System.out.print(x + " ");
        }
    }
}
