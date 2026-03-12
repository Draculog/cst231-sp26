package week8;

public class Sec1_Exam {
    public static void main(String[] args) {
        int k = 0, line = 4, counter = 5;
        while (k < 10) {
            counter--;
            System.out.print(k + "."); //NOTE A PERIOD, NOT A SPACE
            if (counter == line) {
                System.out.println();
                counter = 5;
                line--;
            }
            k++;
        }

    }
}
