package functional_programming.streams_demo;

public class Dish {

    private final String name;
    private final boolean vegetarian;

    private final int calories;
    public enum Type {
        MEAT, FISH, OTHER
    }
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }
}
