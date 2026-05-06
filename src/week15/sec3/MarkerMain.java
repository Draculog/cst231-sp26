package week15.sec3;

public class MarkerMain {
    public static void main(String[] args) {
        String [] names = {"Ann", "Bob"};
        Marker m1 = new Marker();
        System.out.println(m1.getColor());
        m1.setColor("periwinkle");
        System.out.println(m1.getColor());
        System.out.println(m1.getColor());

        Marker m2 = new Marker();
        m2.setColor("red");
        System.out.println(m1.getColor());

        m2.setCapped(false);
        System.out.println(m2.isCapped());

        m1.setCapped(true);
        System.out.println(m2.isCapped());
    }
}