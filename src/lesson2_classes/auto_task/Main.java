package lesson2_classes.auto_task;

/* Класс "Автомобиль". Автомобиль имеет: модель, массу, тип КПП (механическая, автомат), двигатель.
   Двигатель имеет: тип (бензиновый, дизельный, электро), мощность, объем.

        Сделать создание объекта автомобиль, и какой-нибудь красивый вывод информации.

        Модель:          Nissan
        Масса:           1500 кг
        КПП:             Автомат
        Объем двигателя: 1,5 л
        Тип двигателя:   Бензиновый
        Мощность:        90 л.с. */
public class Main {
    public static void main(String[] args) {
        System.out.println("Автомобиль:");
        Avto avto = new Avto("Nissan", 1500, Avto.TypeKPP.AVTO, "123123", Engine.Type.PETROL, 90, 1.5);
        System.out.println(avto.getInfo());
    }
}
