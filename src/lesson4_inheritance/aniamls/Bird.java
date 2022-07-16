package lesson4_inheritance.aniamls;

public class Bird extends Animal {
    public Bird(String color) {
        super(color, "летает");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Твить!");
    }
}
