package lesson2_classes.auto_task;

public class Engine {

    public Type type;
    public double power;
    public double volume;

    public Engine(Type type, double power, double volume) {
        this.type = type;
        this.power = power;
        this.volume = volume;
    }

    public enum Type {
        PETROL("Бензин"), DIESEL("Дизель"), ELECTRO("Электро");
        String TypeName;

        Type(String EngineName) {
            this.TypeName = EngineName;
        }
    }
}
