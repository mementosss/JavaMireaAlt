package Study_Java.Task13.z2;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Резников", "Михаил", "Яковлевич");
        Person person2 = new Person("Смирнов", "Сергей", null);
        Person person3 = new Person("Дзержинский", null, null);

        System.out.println("Полное имя: " + person1.getFullName());
        System.out.println("Полное имя: " + person2.getFullName());
        System.out.println("Полное имя: " + person3.getFullName());
    }
}