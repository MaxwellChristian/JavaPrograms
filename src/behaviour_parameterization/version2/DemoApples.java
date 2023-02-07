package behaviour_parameterization.version2;

import java.util.ArrayList;
import java.util.Comparator;

public class DemoApples {

    public static void main(String []args){

        // create a list of apples

        ArrayList<Apple> apples = new ArrayList<>();

        apples.add(new Apple("Red", 500));
        apples.add(new Apple("Red", 150));
        apples.add(new Apple("Green", 200));
        apples.add(new Apple("Green", 100));
        apples.add(new Apple("Red", 505));

        // get a list of all red apples
        // solution 1: to have a dedicated method
        ArrayList<Apple> redApples = filterApples(apples, "Red");

        // solution 2: to have a class helping to match the apples
        RedApples rA = new RedApples();
        ArrayList<Apple> redApples2 = filterApples(apples, rA);
//        ArrayList<Apple> redApples2 = filterApples(apples, new RedApples());

        // solution 2: to have a class helping to match the apples
        GreenHeavyApples ghA = new GreenHeavyApples();
        ArrayList<Apple> greenHeavyApples = filterApples(apples, ghA);

        // solution 3: using an anonymous class
        // filter all apples that are Red OR Green and having weight between 100 and 300
        ArrayList<Apple> redGreenWeightedApples = filterApples(apples, new AppleCriteria() {
            @Override
            public boolean isMatching(Apple apple) {
                return apple.getColor().equals("Red") ||
                        apple.getColor().equals("Green") &&
                        apple.getWeight() >= 100 && apple.getWeight() <= 300;
            }
        });
        redGreenWeightedApples.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        });

        redGreenWeightedApples.sort((Apple a1, Apple a2)->{
            return a1.getColor().compareTo(a2.getColor());
        });

        // solution 4:  using lambda
            // requirement 1: need to have an interface
            // requirement 2: need to have the method having a parameter of interface
        // fetch all apples that are having weight between 200 or 300 or 500
        ArrayList<Apple> weightedApples = filterApples(apples, (Apple apple) -> {
            return apple.getWeight() == 200 || apple.getWeight() == 300 || apple.getWeight() == 500;
        });




        // get a list of all green apples
        ArrayList<Apple> greenApples = filterApples(apples, "Green");

        // get a list of all apples with weight more than 500
        ArrayList<Apple> heavyApples = filterApples(apples, 500);

        // get a list of all apples that are red and has weight less than specified
        ArrayList<Apple> redApplesWithWeight = filterApples(apples, "Red", 500);

    }

    private static ArrayList<Apple> filterApples(ArrayList<Apple> apples, AppleCriteria criteria) {

        ArrayList<Apple> matchedApples = new ArrayList<>();

        for (Apple apple: apples){
            if(criteria.isMatching(apple)){
                matchedApples.add(apple);
            }
        }

        return matchedApples;
    }

    private static ArrayList<Apple> filterApples(ArrayList<Apple> apples, String color, int weight) {
        ArrayList<Apple> matchedApples = new ArrayList<>();

        // iterate on each apple from the list
        for (Apple apple: apples) {
            // compare with the criteria of color and weight
            if( apple.getWeight() <= weight && apple.getColor().equals(color) ){
                matchedApples.add(apple);
            }
        }

        return matchedApples;
    }

    private static ArrayList<Apple> filterApples(ArrayList<Apple> apples, int weight) {

        ArrayList<Apple> matchedApples = new ArrayList<>();

        // iterate on each apple from the list
        for (Apple apple: apples) {
            // compare with the criteria of color
            if( apple.getWeight() >= weight ){
                matchedApples.add(apple);
            }
        }

        return matchedApples;
    }

    private static ArrayList<Apple> filterApples(ArrayList<Apple> apples, String color) {

        ArrayList<Apple> matchedApples = new ArrayList<>();

        // iterate on each apple from the list
        for (Apple apple: apples) {
            // compare with the criteria of color
            if( color.equals(apple.getColor()) ){
                matchedApples.add(apple);
            }
        }

        return matchedApples;
    }

}
