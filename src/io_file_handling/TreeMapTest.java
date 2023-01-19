package io_file_handling;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {

        // Create a HashMap
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Smith", 30);
        treeMap.put("Anderson", 31);
        treeMap.put("Lewis", 29);
        treeMap.put("Cook", 29);
        treeMap.put("Lewis", 89);

        System.out.println("Display entries in TreeMap");
        System.out.println("[Default sorted on keys]");
        System.out.println(treeMap + "\n");

        System.out.println("Age of 'Anderson': " + treeMap.get("Anderson"));
        System.out.println("Age of 'Lewis': " + treeMap.get("Lewis"));

        System.out.println("All keys in the tree map: ");
        System.out.println(treeMap.keySet());

    }

}
