package lesson4_inheritance.Factory;

public class UkrainianHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth(){
        return 15;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.UKRAINE.countryName + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц";

    }
}
