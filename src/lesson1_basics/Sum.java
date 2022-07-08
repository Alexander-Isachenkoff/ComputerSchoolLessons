package lesson1_basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int n = 5;
        int[] intArray = new int[n];
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            sum += intArray[i];
        }
        System.out.println(sum);
    }
}
