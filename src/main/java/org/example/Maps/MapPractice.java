package org.example.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {
    public static void main(String[] args){
        //Key value pair - hashmap, linked hashmap, treemap
        //Keys are unique
        //Hashmap- random order key and values are printing - complexity O(1)
        //Hashmap allow one null as key and value any number of null
        Map<String, Integer> map= new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Two",4); //Here the value of key will get override
        System.out.println("Printing map: "+ map);  // Printing map: {One=1, Two=4, Three=3}

        //To check if map contains a key or not
        System.out.println("To check if map contains a key or not: "+map.containsKey("Three"));  //To check if map contains a key or not: true
        //To check if map contains a value or not
        System.out.println("To check if map contains a value or not: "+map.containsValue(3));   //To check if map contains a value or not: true
        //To check map is empty or not
        System.out.println("To check map is empty or not: "+ map.isEmpty() );  //To check map is empty or not: false

        //If key is not there add it
        map.putIfAbsent("Six",6);
        System.out.println("Printing map: "+ map); //Printing map: {Six=6, One=1, Two=4, Three=3}

        //Iterating map
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e);
            System.out.println("Keys: "+e.getKey());
            System.out.println("Values: "+e.getValue());
        }

        //To print only keys
        for(String k: map.keySet()){
            System.out.println("Printing only keys: "+k);
        }

        //To print only values
        for(Integer v: map.values()){
            System.out.println("Printing only values: "+v);
        }

        //To remove a particular key value
        System.out.println("Removing key and value pair: "+map.remove("Three")); //Removing key and value pair: 3
        System.out.println(map); //{Six=6, One=1, Two=4}

        map.clear(); //To delete all the values and keys
        System.out.println(map);


        //Linked hash map - keys linked to each other
        Map<String, Integer> linkedHashMap= new LinkedHashMap<>();
        linkedHashMap.put("Two",2);
        linkedHashMap.put("Five",5);
        linkedHashMap.put("One",1);
        linkedHashMap.put("Three",3);
        System.out.println("Printing Linked hash map: "+ linkedHashMap);  //Printing Linked hash map: {Two=2, Five=5, One=1, Three=3}

        //TreeMap - will print in the sort order of the keys - Complexity O(log n)
        //for string - dictionary order
        Map<String, Integer> treeMap= new TreeMap<>();
        treeMap.put("Two",2);
        treeMap.put("Five",5);
        treeMap.put("One",1);
        treeMap.put("Three",3);
        System.out.println("Printing tree map: "+ treeMap); //Printing tree map: {Five=5, One=1, Three=3, Two=2}
    }
}
