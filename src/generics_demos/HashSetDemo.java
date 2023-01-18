package generics_demos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        System.out.println("LinkedHashSet: " + set);

        // Display the elements in the hash set
        for (String element: set)
            System.out.print(element.toLowerCase() + " ");

    }

}
