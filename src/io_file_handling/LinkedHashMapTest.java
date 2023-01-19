package io_file_handling;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapTest {

    public static void main(String[] args) {

        // Create a HashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        linkedHashMap.put("Lewis", 89);

        System.out.println("Display entries in LinkedHashMap");
        System.out.println(linkedHashMap + "\n");

        System.out.println("Age of 'Anderson': " + linkedHashMap.get("Anderson"));
        System.out.println("Age of 'Lewis': " + linkedHashMap.get("Lewis"));

        System.out.println("All keys in the linked hash map: ");
        System.out.println(linkedHashMap.keySet());

        System.out.println("Displaying the name and age: ");
        linkedHashMap.forEach((key, value) -> {
            System.out.println("Name: " + key + ", Age: " + value);
        } );


    }

}












