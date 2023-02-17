package functional_programming.streams_demo;

public record Dish(String name, boolean vegetarian, int calories, functional_programming.streams_demo.Dish.Type type) {

    public enum Type {
        MEAT, FISH, OTHER
    }
}
