package lesson4_inheritance.Factory;

public class BelarusianHen extends Hen {


    @Override
    public int getCountOfEggsPerMonth(){
        return 23;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.BELARUS.countryName + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц";

    }
}
