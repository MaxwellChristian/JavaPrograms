package generics_demos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

    public static void main(String[] args) {

        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        hashMap.put("Lewis", 89);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        System.out.println("Age of 'Anderson': " + hashMap.get("Anderson"));
        System.out.println("Age of 'Lewis': " + hashMap.get("Lewis"));

        System.out.println("All keys in the hash map: ");
        System.out.println(hashMap.keySet());


    }

}
