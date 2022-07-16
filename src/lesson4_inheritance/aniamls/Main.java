package lesson4_inheritance.aniamls;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        
        Bird parrot = new Bird("зелёный");
        Snake snake = new Snake("черная", true);
        Snake snake1 = new Snake("зеленая", false);
        Dog dog1 = new Dog("Рыжая", "гладкошорстная", "шарпей");
        Bird seagull = new Bird("белый");
        
        animals.add(parrot);
        animals.add(snake);
        animals.add(snake1);
        animals.add(dog1);
        animals.add(seagull);
    
//        for (Animal animal : animals) {
//            animal.makeSound();
//        }
    
        Pet bublic = new DomesticDog("белая", "лохматая", "болонка", "Бублик");
        System.out.println(bublic.getName());
    }
}
