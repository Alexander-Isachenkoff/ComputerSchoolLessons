package lesson4_inheritance.Factory;

public abstract class Hen {
    private int countOfEggsPerMonth;
    private String description;

    public Hen (int countOfEggsPerMonth, String description)
    {
        this.countOfEggsPerMonth = countOfEggsPerMonth;
        this.description = description;
    }

    protected abstract int getCountOfEggsPerMonth();

    public String getDescription(){
        return ("Я курица");
    }

//    public void description()
//    {
//        System.out.println("Я курица");
//    }

}
