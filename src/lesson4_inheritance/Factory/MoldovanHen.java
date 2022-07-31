package lesson4_inheritance.Factory;

public class MoldovanHen extends Hen{

    @Override
    public int getCountOfEggsPerMonth(){
        return 20;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + "Моя страна - " + Country.MOLDOVA.countryName + ". Я несу " + getCountOfEggsPerMonth() + "яиц в месяц";

    }
}
