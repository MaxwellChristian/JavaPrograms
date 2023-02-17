package functional_programming.streams_demo;

import java.util.*;
import java.util.stream.Collectors;

public class MenuOfDishes {

    public static void main(String[] args) {

        // create a menu with some dishes

        List<Dish> menu = new ArrayList<>();
        menu.add(new Dish("Pork Chops", false, 800, Dish.Type.MEAT));
        menu.add(new Dish("Beef Burger", false, 700, Dish.Type.MEAT));

        menu.add(new Dish("Chicken Wings", false, 400, Dish.Type.MEAT));
        menu.add(new Dish("French Fries", false, 500, Dish.Type.OTHER));
        menu.add(new Dish("Fried Rice", false, 350, Dish.Type.OTHER));
        menu.add(new Dish("Diced Seasonal Fruits", false, 100, Dish.Type.OTHER));

        menu.add(new Dish("Cheese Burst Pizza", false, 800, Dish.Type.OTHER));

        menu.add(new Dish("Prawns Platter", false, 400, Dish.Type.FISH));
        menu.add(new Dish("Charcoal cooked Salman", false, 300, Dish.Type.FISH));

        // Requirement 1: Fetch only the name of the dishes that are low in calories (calories less than 400).
        // The fetched list muse be sorted on number of calories

        // the following function completes the task WITHOUT using STREAMS
        performWithoutStreams(menu);

        // the following functions completes the task WITH the use of STREAMS4
        performUsingStreams(menu);

        // Requirement 2: Fetch only the names of FEW high calorie dishes
        // -- the calorie and the count must be dynamic
        // sorted on calories in decreasing order and
        // then sorted on name in ascending order

        // fetch the calories and count from command line argument

        List<String> topHighCalorieDishes = fetchHighCalorieDishes(menu, 500, 3);
        System.out.println(topHighCalorieDishes);

        // fetch the dish with the maximum calorie
//        Optional<Dish> maxCalorieDish = menu.stream().collect(Collectors.maxBy(Comparator.comparing(Dish::calories)));
        Optional<Dish> maxCalorieDish = menu.stream().max(Comparator.comparing(Dish::calories));

        // display the dish having maximum calorie
//        System.out.println("Max calorie dish: " + maxCalorieDish.get().name());
        System.out.println("Max calorie dish: " + (maxCalorieDish.isPresent() ? maxCalorieDish.get().name() : "No dishes in menu"));

        IntSummaryStatistics menuStatistics = menu.stream()
                .collect(Collectors.summarizingInt(Dish::calories));

        System.out.println("Total calories: " + menuStatistics.getSum());
        System.out.println("Average calories: " + menuStatistics.getAverage());
        System.out.println("Minimum calorie on menu: " + menuStatistics.getMin());
        System.out.println("Maximum calorie on menu: " + menuStatistics.getMax());
        System.out.println("Total dishes on menu: " + menuStatistics.getCount());
    }

    private static List<String> fetchHighCalorieDishes(List<Dish> dishes, int calorie, int count) {

        Comparator<Dish> comparator = Comparator.comparing(Dish::calories).reversed();
        comparator = comparator.thenComparing(Dish::name);

        Comparator<Dish> cmp2 = Comparator.comparingInt(Dish::calories);
        cmp2 = cmp2.reversed();
        cmp2 = cmp2.thenComparing(Dish::name);

        return dishes.stream()
                .filter(dish -> dish.calories() > calorie)
//                .sorted(
//                  Comparator.comparingInt(Dish::getCalories)
//                  .reversed()
//                  .thenComparing(Dish::getName)
//                  )
                .sorted(comparator)
                .map(Dish::name)
                .limit(count)
                .collect(Collectors.toList());
    }


    private static void performWithoutStreams(List<Dish> menu) {
        // 1. fetch all dishes with low calories
        List<Dish> lowCalorieDishes = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.calories() < 400) {
                lowCalorieDishes.add(dish);
            }
        }

        // 2. sort all the fetched low calorie dishes on the calories
        lowCalorieDishes.sort(Comparator.comparingInt(Dish::calories));

        // 3. get a list which has just the names of fetched low calories dishes
        List<String> lowCalorieDishNames = new ArrayList<>();
        for (Dish dish : lowCalorieDishes) {
            lowCalorieDishNames.add(dish.name());
        }

        // 4. Display the finalised list with names of low calorie dishes
        System.out.println(lowCalorieDishNames);
    }

    private static void performUsingStreams(List<Dish> menu) {
        System.out.println(
                menu.stream()
                        .filter(dish -> dish.calories() < 400)
                        .sorted(Comparator.comparingInt(Dish::calories))
                        .map(Dish::name)
                        .collect(Collectors.toList())
        );
    }

}
