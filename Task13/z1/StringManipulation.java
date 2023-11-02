package Study_Java.Task13.z1;

public class StringManipulation {
    public static void main(String[] args) {
        String inputString = "I like Java!!!";
        manipulateString(inputString);
    }

    public static void manipulateString(String input) {
        // 2. Распечатать последний символ строки.
        char lastChar = input.charAt(input.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

        // 3. Проверить, заканчивается ли строка подстрокой "!!!".
        boolean endsWithExclamation = input.endsWith("!!!");
        System.out.println("Строка заканчивается на '!!!': " + endsWithExclamation);

        // 4. Проверить, начинается ли строка подстрокой "I like".
        boolean startsWithILike = input.startsWith("I like");
        System.out.println("Строка начинается с 'I like': " + startsWithILike);

        // 5. Проверить, содержит ли строка подстроку "Java".
        boolean containsJava = input.contains("Java");
        System.out.println("Строка содержит 'Java': " + containsJava);

        // 6. Найти позицию подстроки "Java" в строке.
        int indexOfJava = input.indexOf("Java") + 1;
        int indexOfLastSubstringChar = input.indexOf("!!!");
        System.out.println("Позиция подстроки 'Java': " + indexOfJava + "\s--\s" + indexOfLastSubstringChar);

        // 7. Заменить все символы 'a' на 'o'.
        String replacedString = input.replace('a', 'o');
        System.out.println("Замененная строка: " + replacedString);

        // 8. Преобразовать строку к верхнему регистру.
        String uppercaseString = input.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + uppercaseString);

        // 9. Преобразовать строку к нижнему регистру.
        String lowercaseString = input.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowercaseString);

        // 10. Вырезать строку "Java" с помощью метода String.substring().
        int startIndex = input.indexOf("Java");
        int endIndex = startIndex + "Java".length();
        String substringJava = input.substring(0, startIndex) + input.substring(endIndex);
        System.out.println("Строка без 'Java': " + substringJava);
    }
}