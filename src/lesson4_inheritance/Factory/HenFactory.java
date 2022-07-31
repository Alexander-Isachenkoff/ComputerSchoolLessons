package lesson4_inheritance.Factory;

public class HenFactory {

    static Hen getHen(Country country) {
        Hen hen = null;
        if (country.equals(Country.BELARUS)) {
            hen = new BelarusianHen();
        }
        if (country.equals(Country.MOLDOVA)) {
            hen = new MoldovanHen();
        }
        if (country.equals(Country.RUSSIA)) {
            hen = new RussianHen();
        }
        if (country.equals(Country.UKRAINE)) {
            hen = new UkrainianHen();
        }
        return hen;
    }
}
