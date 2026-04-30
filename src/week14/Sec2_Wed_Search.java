package week14;

public class Sec2_Wed_Search {
    public static void main(String[] args) {
        int [] a = {2, 7, -4, 12, -12, -12, 9, 6, -3, 0};
        print(a);
        int largest = findLargest(a);
        System.out.println(largest);
    }

    public static boolean linearSearch(int [] a, int target) {
        for(int i = 0; i < a.length; i++) {
            if(a[i] == target) {
                return true;
            }
//            else {
//                return false;
//            }
        }
        return false;
    }

    public static int findIndexOfLargest(int [] a) {
        int largestIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[largestIndex]) {
//                a[largestIndex] = a[i];
                largestIndex = i;
            }
        }
        return largestIndex;
    }

    public static int findLargest(int [] a) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        return largest;
    }

    public static void print(int [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
