package week15.sec3;

public class Set {
    private int [] elements = new int[10];
    private int count = 0;

    public void add(int x) {
        for (int i = 0; i < count; i++) {
            if (elements[i] == x) {
                return;
            }
        }
        elements[count] = x;
        count++;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}
