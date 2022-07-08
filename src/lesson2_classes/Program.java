package lesson2_classes;

public class Program {

    public static void main(String[] args) {
//        lesson.StringList stringList = new lesson.StringList(")", ";", ".");
//        stringList.arrayList.add("Строка 1"); // 0
//        stringList.arrayList.add("Строка 2"); // 1
//        stringList.arrayList.add("Строка 3"); // 2
//
//        System.out.println(stringList);
//         createPerson();

        System.out.println(MyMath.round(5.126, 2));   // 5.13
        System.out.println(MyMath.round(5.12684, 3)); // 5.127
    }

    private static void createPerson() {
        Person person = new Person(
                "Сергей",
                "Петухов",
                Gender.MALE,
                17,
                "+79500764414",
                "example@mail.ru",
                "ул. Лермонтова"
        );
        System.out.println(person);
    }

}
