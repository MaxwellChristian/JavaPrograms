package functional_programming.streams_demo;

// This class stores information regarding Traders

public class Trader {

    // stores the name of the trader
    private final String name;
    // stores the city where the trader belongs/works-from
    private final String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
