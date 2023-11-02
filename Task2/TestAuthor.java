package Study_Java.Task2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Миша", "misha@gmail.com", 'M');
        Author a2 = new Author("Alexandra", "fashion@gmail.com", 'F');
        Author a3 = new Author("UFO", "Marsianin@aliens.from.mars", 'U');
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3 + "\n");
        a1.setEmail("mikl@yandex.ru");
        System.out.println("First author's data (only email) was changed to: " + a1);
    }
}