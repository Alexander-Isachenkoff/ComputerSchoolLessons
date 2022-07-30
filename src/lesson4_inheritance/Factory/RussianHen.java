package lesson4_inheritance.Factory;

public class RussianHen extends Hen {

    public RussianHen(int countOfEggsPerMonth, String description) {
        super(25, description);
    }

    @Override
    public int getCountOfEggsPerMonth(){
        return 25;
    }

    @Override
    public String getDescription(){
        System.out.println(getDescription() + "Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + "яиц в месяц");
        return getDescription();
    }
}
