package lesson4_inheritance.Factory;

public class RussianHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth(){
        return 25;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.RUSSIA.countryName + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц";

    }
}
