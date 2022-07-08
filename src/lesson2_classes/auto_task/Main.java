package lesson2_classes.auto_task;

public class Main {
    public static void main(String[] args) {
        System.out.println("Автомобиль:");
        Avto avto = new Avto("Nissan", 1500, Avto.TypeKPP.AVTO, Engine.Type.PETROL, 90, 1.5);
        System.out.println(avto.getInfo());
    }
}
