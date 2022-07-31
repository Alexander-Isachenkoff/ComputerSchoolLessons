package lesson2_classes.auto_task;

public class Engine {

    private String number;
    private Type type;
    private double power;
    private double volume;

    public Engine(String number, Type type, double power, double volume) {
        this.number = number;
        this.type = type;
        this.power = power;
        this.volume = volume;
    }

    public String getNumber() {
        return number;
    }

    public Type getType() {
        return type;
    }

    public double getPower() {
        return power;
    }

    public double getVolume() {
        return volume;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "number='" + number + '\'' +
                ", type=" + type +
                ", power=" + power +
                ", volume=" + volume +
                '}';
    }

    public enum Type {
        PETROL("Бензин"),
        DIESEL("Дизель"),
        ELECTRO("Электро");

        String TypeName;

        Type(String EngineName) {
            this.TypeName = EngineName;
        }

        @Override
        public String toString() {
            return TypeName;
        }
    }
}
