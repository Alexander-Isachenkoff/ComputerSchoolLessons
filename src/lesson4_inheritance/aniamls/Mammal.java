package lesson4_inheritance.aniamls;

// класс млекопитающее
// Mammal is an Animal
public abstract class Mammal extends Animal {
    
    private String shaggy; // лохматость
    
    public Mammal(String color, String movingMethod, String shaggy) {
        super(color, movingMethod);
        this.shaggy = shaggy;
    }
    
    public String getShaggy() {
        return shaggy;
    }
}
