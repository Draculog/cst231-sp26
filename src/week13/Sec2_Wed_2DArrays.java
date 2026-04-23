package week13;

import java.util.Scanner;

public class Sec2_Wed_2DArrays {
    public static void main(String[] args) {
        char c = 'c';
        char d = 99;
        System.out.println(c);
        System.out.println(d);
        for(char i = 48; i < 58; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        Scanner in = new Scanner(System.in);
        String [] words = new String[4];
        System.out.println("hello".length());
        loadArray(in, words);

//        System.out.print("Enter a word: ");
//        String word = in.next();
//        System.out.println(word.length());
//        System.out.println(word.charAt(0));
////        word[0]
//        for (int i = 0; i < word.length(); i++) {
//            System.out.print(word.charAt(i) + " ");
//        }
//        System.out.println();
//        String upperWord = word.toUpperCase();
//        System.out.println(upperWord);
//        String s1 = new String("foo");
//        String s2 = new String("foo");
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
    }

    public static void loadArray(Scanner s, String [] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print("Enter a word: ");
            a[i] = s.next();
        }
    }

    public static int countCharacters(String [] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count += a[i].length();
            // count = count + a[i].length();
//            String s = a[i];
//            s.length();
        }

        return count;
    }
}
