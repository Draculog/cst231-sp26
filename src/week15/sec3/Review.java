package week15.sec3;

public class Review {
    public static void main(String[] args) {

        double [][] u = new double[3][4];
        double currentValue = 0.0;
        for (int row = 0;
             row < u.length;
             row++) {
            for (int col = 0;
                 col < u[row].length;
                 col++) {
                u[row][col] = currentValue;
                currentValue += 0.25;
            }
        }
    }

    public static void print(double [][] v) {
        for (int i = 0; i < v.length; i++) {
            for (int k = 0; k < v[i].length; k++) {
                System.out.print(v[i][k] + " ");
            }
            System.out.println();
        }
    }
}
