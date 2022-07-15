package lesson2_classes.library;

import java.util.ArrayList;
import java.util.Scanner;

import static lesson2_classes.library.Section.FANTASTIC;
import static lesson2_classes.library.Section.SCIENCE;

/* Создать классовую модель для библиотеки:
В библиотеке имеются книги.
У каждой книги есть: название, автор, год издания, кол-во страниц, раздел (наука, фантастика, детектив и т.п).
Имеются читатели.
У каждого читателя есть: имя, адрес, номер телефона. А также список взятых и возвращенных книг.
Одна запись в списке представляет собой: книгу, дату получения и дату возврата
(если книгу еще не вернули, то можно вместо даты возврата использовать null)
Должен быть метод для добавления читателю новой записи о взятой книге
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> book = new ArrayList<>();
        ArrayList<Reader> readers = new ArrayList<>();

        System.out.println("Запиши запись:");
        var books = new Books();
        System.out.println("Введи название книги:");
        books.setName(scanner.next());
        System.out.println("Введи имя автора:");
        books.setAuthor(scanner.next());
        System.out.println("Введи регистрационный номер:");
        books.setId(scanner.nextInt());
        System.out.println("Введи год издания:");
        books.setYear(scanner.nextInt());
        System.out.println("Введи кол-во страниц:");
        books.setPages(scanner.nextInt());
        boolean exit = false;
        while (!exit){
            System.out.println("1. Наука");
            System.out.println("2. Фантастика");
            int choice = readInt();
            switch (choice){
                case 1:
                    books.setSection(SCIENCE);
                    exit=true;
                    break;
                case 2:
                    books.setSection(FANTASTIC);
                    exit=true;
                    break;
                default:
                    System.out.println("Не верная команда");
                    break;
            }
        }


        books.add(books);

        System.out.println(books.getInfo());

    }
    private static int readInt() {
        int choice = -1;
        try {
            Scanner scanner;
// choice = Integer.parseInt(scanner.nextLine());
        }
        catch (NumberFormatException ex) {
            System.out.println("Вводите только цифры");
            choice = readInt();
        }
        return choice;
    }

}
