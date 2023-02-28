package functional_programming.streams_demo;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class MenuOfDishes {

    public static void main(String[] args) {

        // create a menu with some dishes

        List<Dish> menu = new ArrayList<>();
        menu.add(new Dish("Pork Chops", false, 800, Dish.Type.MEAT));
        menu.add(new Dish("Beef Burger", false, 700, Dish.Type.MEAT));

        menu.add(new Dish("Chicken Wings", false, 400, Dish.Type.MEAT));
        menu.add(new Dish("French Fries", true, 500, Dish.Type.OTHER));
        menu.add(new Dish("Fried Rice", false, 350, Dish.Type.OTHER));
        menu.add(new Dish("Diced Seasonal Fruits", true, 100, Dish.Type.OTHER));

        menu.add(new Dish("Cheese Burst Pizza", true, 800, Dish.Type.OTHER));

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

        // with database we have encountered the concept of grouping

        // 1. create a stream
        // 2. collect the elements from the stream on a group
        // 2.1 create a group using collectors [grouping on the base of a field]
        Map<Dish.Type, List<Dish>> dishesGroupedByType = menu.stream().collect(Collectors.groupingBy(Dish::type));
        for (Dish.Type type:
             dishesGroupedByType.keySet()) {
            System.out.println( type + " : " + dishesGroupedByType.get(type) );
        }

        // we wish to fetch the dishes as per types
        // and also label each dish as DIET/NORMAL/FAT dish on basis of calories
        // calories between 400 and 600 : normal dish
        // calories less than 400 : diet dish
        // calories above 600 : fat dish

        // we can also use lambda with collectors and grouping

        enum CalorieLevel { DIET, NORMAL, FAT };

        Map<CalorieLevel, List<Dish>> dishesByCalorieLevel = menu.stream().collect(Collectors.groupingBy(dish -> {
            if (dish.calories() <= 400) {
                return CalorieLevel.DIET;
            } else {
                if (dish.calories() <= 600) {
                    return CalorieLevel.NORMAL;
                } else {
                    return CalorieLevel.FAT;
                }
            }
        }));

        for (CalorieLevel type:
                dishesByCalorieLevel.keySet()) {
            System.out.println( type + " : " + dishesByCalorieLevel.get(type) );
        }

        // try out
        // group the dishes as per their TYPE followed by the CALORIE LEVEL
        // i.e. grouped as per MEAT/FISH/OTHER and then grouped as DIET/NORMAL/FAT
        Map<Dish.Type, Map<CalorieLevel, List<Dish>>> dishes = menu.stream().collect(Collectors.groupingBy(Dish::type, Collectors.groupingBy(dish -> {
            if (dish.calories() <= 400) {
                return CalorieLevel.DIET;
            } else {
                if (dish.calories() <= 600) {
                    return CalorieLevel.NORMAL;
                } else {
                    return CalorieLevel.FAT;
                }
            }
        })));

        System.out.println(dishes);

        // let us count the total dishes in each type of group i.e., count dishes of each type
        Map<Dish.Type, Long> totalDishesOfEachType = menu.stream().collect(Collectors.groupingBy(Dish::type, Collectors.counting()));
        System.out.println(totalDishesOfEachType);

        // try out
        // display the maximum calories dish in each group
        // i.e., display the dish in each type that has maximum calorie
        Map<Dish.Type, Optional<Dish>> dishWithMaxCalorieInType = menu.stream().collect(Collectors.groupingBy(Dish::type, Collectors.maxBy(Comparator.comparingInt(Dish::calories))));
        System.out.println(dishWithMaxCalorieInType);

        // the same result achieved after removing the optional part
        Map<Dish.Type, Dish> maxDishes = menu.stream().collect(Collectors.groupingBy(Dish::type, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Dish::calories)), Optional::get)));
        System.out.println(maxDishes);

        // display the calories levels available with each type of dish
        // e.g.: FISH has diet and normal dishes. meat has normal and fat dishes, etc.
        Map<Dish.Type, Set<CalorieLevel>> dishes2 = menu.stream().collect(Collectors.groupingBy(Dish::type, Collectors.mapping(dish -> {
            if (dish.calories() <= 400) {
                return CalorieLevel.DIET;
            } else {
                if (dish.calories() <= 600) {
                    return CalorieLevel.NORMAL;
                } else {
                    return CalorieLevel.FAT;
                }
            }
        }, Collectors.toSet())));

        System.out.println(dishes2);

        // fetch the dishes separated on the criteria whether it is a vegetarian dish or not
        // here we need to fetch both the type of dishes i.e., vegetarian and non-vegetarian
        Map<Boolean, List<Dish>> separatedDishes = menu.stream().collect(Collectors.partitioningBy(Dish::vegetarian));
        for (Boolean type:
             separatedDishes.keySet()) {
            System.out.println("Vegetarian : " + type + " : " + separatedDishes.get(type));
        }

        // dishes separated on base on vegetarian and then grouped as per type
        Map<Boolean, Map<Dish.Type, List<Dish>>> separatedDishesGroupedByType = menu.stream().collect(Collectors.partitioningBy(Dish::vegetarian, Collectors.groupingBy(Dish::type)));
        System.out.println(separatedDishesGroupedByType);
        System.out.println(separatedDishesGroupedByType.get(true));



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
