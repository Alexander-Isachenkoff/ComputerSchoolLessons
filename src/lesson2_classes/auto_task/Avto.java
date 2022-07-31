package lesson2_classes.auto_task;

public class Avto {
    private String mod;
    private double weight;
    private TypeKPP typeKPP;
    private Engine engine;

    public Avto (String mod, double weight, TypeKPP typeKPP, String engineNumber, Engine.Type type, double power, double volume) {
        this.mod = mod;
        this.weight = weight;
        this.typeKPP = typeKPP;
        this.engine = new Engine(engineNumber, type, power, volume);
    }

    String getInfo() {
        String info = "";
        info += "Модель        " + mod + "\n";
        info += "Масса         " + weight + "\n";
        info += "Тип КПП       " + typeKPP.TypeKPPName + "\n";
        info += "Тип двигателя " + engine.getType().TypeName + "\n";
        info += "Мощность      " + engine.getPower() + "\n";
        info += "Объём         " + engine.getVolume() + "\n";
        return info;
    }

    public enum TypeKPP {
        MECH("Механика"), AVTO("Автомат");
        String TypeKPPName;
        TypeKPP (String TypeName) {
            this.TypeKPPName = TypeName;
        }
    }

}
