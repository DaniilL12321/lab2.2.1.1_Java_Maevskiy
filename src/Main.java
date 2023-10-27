import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слово: ");
        String word = scanner.next();

        System.out.print("Введите символ: ");
        char symbol = scanner.next().charAt(0);

        // Заменяем первую букву "А" на символ
        String word1 = word.replaceFirst("А", String.valueOf(symbol));

        System.out.println("\nИсходное слово: " + word);
        System.out.println("Введенный символ: " + symbol);
        System.out.println("Результат: " + symbol + word1);

        scanner.close();
    }
}