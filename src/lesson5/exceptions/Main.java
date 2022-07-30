package lesson5.exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            example();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void example() throws WrongRangeException, NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        int number;

        // 2 типа исключений:
        // проверяемые   - Exception
        // непроверяемые - RuntimeException

        try {
            number = Integer.parseInt(line);
        } catch (NumberFormatException exception) {
            throw new NumberFormatException("Строка " + line + " не является числом");
        }

        if (number >= 1 && number <= 10) {
            System.out.println("Число " + number);
        } else {
            throw new WrongRangeException("Число должно быть от 1 до 10");
        }
    }
}
