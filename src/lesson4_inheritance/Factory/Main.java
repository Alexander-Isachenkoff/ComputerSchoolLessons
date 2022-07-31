package lesson4_inheritance.Factory;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());

    }
}
enum Country
{
    BELARUS("Беларусия"),MOLDOVA("Молдова"),RUSSIA("Россия"), UKRAINE("Украина");
    String countryName;
    Country (String country)
    {this.countryName = country;}
}