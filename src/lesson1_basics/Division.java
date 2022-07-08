package lesson1_basics;

import java.util.Arrays;
import java.util.Scanner;

/*  Вводится чётное количество чисел. Нужно каждое первое разделить на каждое второе. Результат вывести в виде выражения. Количество вводимых чисел вводится с клавиатуры. Числа могут быть как целыми так и нет.

        Пример:
        Ввод:
        6 (количество чисел)
        1
        2
        3
        4
        5.5
        6

        Вывод:
        1 / 2 = 0,5
        3 / 4 = 0,75
        5,5 / 6 = 0,9166666666666667
*/
public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи количество чисел:");
        int sizeArray = scanner.nextInt();

        while (sizeArray % 2 != 0) {
            System.out.println("Размер нечетный. Введи еще раз:");
            sizeArray = scanner.nextInt();
        }
        System.out.println("Размер верный: " + sizeArray);

        double[] array = new double[sizeArray];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введи: " + (i + 1) + " элемент:");
            array[i] = scanner.nextDouble();
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                double result = array[i] / array[i+1];
                System.out.println(array[i] + " / " + array[i+1] + " = " + result);
            }
        }
    }

}