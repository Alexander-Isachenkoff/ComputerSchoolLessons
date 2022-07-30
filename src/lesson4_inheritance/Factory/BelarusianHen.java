package lesson4_inheritance.Factory;

public class BelarusianHen extends Hen {

    public BelarusianHen (int countOfEggsPerMonth, String description) {
        super(23, description);
    }


    @Override
    public int getCountOfEggsPerMonth(){
        return 23;
    }

    @Override
    public String getDescription(){
        System.out.println(getDescription() + "Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + "яиц в месяц");
        return getDescription();
    }
}
