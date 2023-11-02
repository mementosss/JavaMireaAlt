package Study_Java.Task7.z5;

public class Main {
    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulatorer();

        String inputString = "I love RTU MIREA!";

        int charCount = stringManipulator.podschetSimvolov(inputString);
        System.out.println("Char count: " + charCount);

        String oddChars = stringManipulator.nechetniyeSimvoly(inputString);
        System.out.println("Nechetnie pos:: " + oddChars);

        String reversedString = stringManipulator.obratnayaStroka(inputString);
        System.out.println("Reverse string: " + reversedString);
    }
}