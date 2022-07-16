package lesson4_inheritance.aniamls;

public class Dog extends LandMammal {
    
    private String breed; // порода
    
    public Dog(String color, String shaggy, String breed) {
        super(color, shaggy);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
    
    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }
}
