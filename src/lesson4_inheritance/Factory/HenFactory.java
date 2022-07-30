package lesson4_inheritance.Factory;

public class HenFactory {
    private Hen hen;
    private String country;
//
    public HenFactory (Hen hen, String country)
    {this.hen = hen;
    this.country = country;}

    public static Hen getHen(Country name) {
        return getHen();
    }

    public static Hen getHen() {
        return getHen();
    }

    public String getCountry() {
        return country;
    }
}
