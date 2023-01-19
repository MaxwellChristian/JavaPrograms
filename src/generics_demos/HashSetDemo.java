package generics_demos;

import java.util.*;

public class HashSetDemo {

    public static void main(String []args){

        HashSet<String> uniqueSet = new HashSet<>(List.of(args));
        System.out.println(uniqueSet);

        for (String word : uniqueSet) {
            System.out.println(word);
        }

        // Create a linked hash set
        Set<String> set = new LinkedHashSet<>();

        // Add strings to the set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco"); // not a float value
        set.add("Beijing");
        set.add("New York");
        int x;//float

        System.out.println("LinkedHashSet: " + set);

        // Display the elements in the hash set
        for (String element: set)
            System.out.print(element.toLowerCase() + " ");

        System.out.println();
        System.out.println();

        // Tree set [with natural sorting order]
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("Sorted tree set: " + treeSet);

        // Use the methods in SortedSet interface
        System.out.println("first(): " + treeSet.first());
        System.out.println("last(): " + treeSet.last());
        System.out.println("headSet(\"New York\"): " +
                treeSet.headSet("New York"));
        System.out.println("tailSet(\"New York\"): " +
                treeSet.tailSet("New York"));

        // Use the methods in NavigableSet interface
        System.out.println("lower(\"P\"): " + treeSet.lower("P"));
        System.out.println("higher(\"P\"): " + treeSet.higher("P"));
        System.out.println("floor(\"P\"): " + treeSet.floor("P"));
        System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P"));
        System.out.println("pollFirst(): " + treeSet.pollFirst());
        System.out.println("pollLast(): " + treeSet.pollLast());
        System.out.println("New tree set: " + treeSet);

    }

}
