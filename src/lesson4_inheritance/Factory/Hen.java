package lesson4_inheritance.Factory;

public abstract class Hen {

    protected abstract int getCountOfEggsPerMonth();

    public String getDescription(){
        return ("Я курица");
    }


}
