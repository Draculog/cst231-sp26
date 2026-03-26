package week10;

public class ScopeExample {
    public static void main(String[] args) {
        {
            int x = 5;
            {
                int y = 6;
                {
                    System.out.println(y);
                    int z = 7;
                }
//                System.out.println(z);
            }

            System.out.println(x);
//            System.out.println(y);

        }
    }
}
