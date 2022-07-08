package lesson2_classes.examples;

public class MyMath {
    public static double round(double number, int acc) {
        double n = Math.pow(10, acc);
        return Math.round(number * n) / n;
    }
}
