package lesson4_inheritance.aniamls;

public class Snake extends Animal {
    
    private boolean venomous; // ядовитость
    
    public Snake(String color, boolean venomous) {
        super(color, "ползает");
        this.venomous = venomous;
    }
    
    public boolean isVenomous() {
        return venomous;
    }
    
    @Override
    public void makeSound() {
        System.out.println("Шшшшшш!");;
    }
}
