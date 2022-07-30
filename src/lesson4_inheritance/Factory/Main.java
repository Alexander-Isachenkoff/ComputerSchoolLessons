package lesson4_inheritance.Factory;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());

        class HenFactory {
            Hen getHen(String country) {
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
    }
}
enum Country
{
    BELARUS("Беларусия"),MOLDOVA("Молдова"),RUSSIA("Россия"), UKRAINE("Украина");
    String countryName;
    Country (String country)
    {this.countryName = country;}
}