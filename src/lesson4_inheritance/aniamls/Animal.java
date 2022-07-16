package lesson4_inheritance.aniamls;

// Класс животное
public abstract class Animal {
    private String color;
    private String movingMethod;
    
    public Animal(String color, String movingMethod) {
        this.color = color;
        this.movingMethod = movingMethod;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getMovingMethod() {
        return movingMethod;
    }
    
    protected abstract void makeSound();
}
