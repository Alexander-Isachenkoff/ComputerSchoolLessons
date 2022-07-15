package lesson2_classes.library;

import java.util.ArrayList;
import java.util.Scanner;

import static lesson2_classes.library.Section.*;

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

        Book book = new Book("Моё вечное завоевание", "Лермонтов", 771981, 1997, 424, BIOGRAPHY);

        System.out.println(book.getInfo());

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

    private static Book createBookManual(){
        System.out.println("Запиши запись:");
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();

        System.out.println("Введи название книги:");
        book.setName(scanner.next());
        System.out.println("Введи имя автора:");
        book.setAuthor(scanner.next());
        System.out.println("Введи регистрационный номер:");
        book.setId(scanner.nextInt());
        System.out.println("Введи год издания:");
        book.setYear(scanner.nextInt());
        System.out.println("Введи кол-во страниц:");
        book.setPages(scanner.nextInt());
        boolean exit = false;
        while (!exit){
            System.out.println("1. Наука");
            System.out.println("2. Фантастика");
            int choice = readInt();
            switch (choice){
                case 1:
                    book.setSection(SCIENCE);
                    exit=true;
                    break;
                case 2:
                    book.setSection(FANTASTIC);
                    exit=true;
                    break;
                default:
                    System.out.println("Не верная команда");
                    break;
            }
        }
        return book;
    }

}
