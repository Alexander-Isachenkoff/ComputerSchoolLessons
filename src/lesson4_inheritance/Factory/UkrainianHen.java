package lesson4_inheritance.Factory;

public class UkrainianHen extends Hen {

    public UkrainianHen(int countOfEggsPerMonth, String description) {
        super(15, description);
    }

    @Override
    public int getCountOfEggsPerMonth(){
        return 15;
    }

    @Override
    public String getDescription(){
        System.out.println(getDescription() + "Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + "яиц в месяц");
        return getDescription();
    }
}
