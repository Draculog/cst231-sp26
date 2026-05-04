package week15.sec1;

public class Main {
    public static void main(String[] args) {
        Marker m = new Marker();
        System.out.println(m.getColor());
        m.setColor("blue");
        System.out.println(m.getColor());
        m.setColor("red");
        System.out.println(m.getColor());

        Marker m2 = new Marker();
        System.out.println(m2.getColor());

        m.setCapped(true);
        System.out.println(m.isCapped());

        m2.setCapped(false);
        System.out.println(m.isCapped());
        System.out.println(m2.isCapped());

//        System.out.println(Marker.isCapped());

    }
}
