package Study_Java.Task7.z7;

public class Main {
    public static void main(String[] args) {
        Magazine[] magazine = new Magazine[3];
        magazine[0] = new Magazine("Nike");
        magazine[1] = new Magazine("Adidas");
        magazine[2] = new Magazine("New Balance");

        Printable[] printable = new Printable[4];
        printable[0] = magazine[0];
        printable[1] = magazine[1];
        printable[2] = magazine[2];

        Magazine.printMagazines(printable);
    }
}