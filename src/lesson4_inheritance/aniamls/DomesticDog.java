package lesson4_inheritance.aniamls;

// домашняя собака
public class DomesticDog extends Dog implements Pet {
    
    private String name;
    
    public DomesticDog(String color, String shaggy, String breed, String name) {
        super(color, shaggy, breed);
        this.name = name;
    }
    
    @Override
    public String getName() {
        return name;
    }
}
