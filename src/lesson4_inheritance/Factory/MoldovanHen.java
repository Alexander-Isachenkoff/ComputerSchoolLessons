package lesson4_inheritance.Factory;

public class MoldovanHen extends Hen{
    public MoldovanHen(int countOfEggsPerMonth, String description) {
        super(countOfEggsPerMonth, description);
    }

    @Override
    public int getCountOfEggsPerMonth(){
        return 20;
    }

    @Override
    public String getDescription(){
        System.out.println( getDescription() + "Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + "яиц в месяц");
        return getDescription();
    }
}
