package Study_Java.Task3.z1;

public class TestShape {
    public static void main(String[] args) {
        Krug k1 = new Krug(5.2);
        Pryamougolnik p1 = new Pryamougolnik(10, 4.5);

        System.out.println("Krug:");
        System.out.println("S: " + k1.calculateS());
        System.out.println("P: " + k1.calculateP());

        System.out.println("");

        System.out.println("Pryamougolnik:");
        System.out.println("S: " + p1.calculateS());
        System.out.println("P: " + p1.calculateP());
    }
}