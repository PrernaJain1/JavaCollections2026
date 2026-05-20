package org.example;

import java.util.*;

public class CollectionsPractice {
    public static void main(String[] args){
        List<Integer> l = new ArrayList<>();
        l.add(23);
        l.add(45);
        l.add(1);
        l.add(45);
        l.add(9);

        System.out.println("Printing list: "+l); //Printing list: [23, 45, 1, 45, 9]
        //To get the minimum element in collection
        System.out.println("Min ele in collection: "+Collections.min(l)); //Min ele in collection: 1

        //To get the max element in collection
        System.out.println("Max ele in collection: "+ Collections.max(l)); //Max ele in collection: 45

        //To get the frequency of element in collection
        System.out.println("Frequency: "+ Collections.frequency(l,45)); //Frequency: 2

        //To sort
        Collections.sort(l);
        System.out.println("Sorted list: "+ l);  //Sorted list: [1, 9, 23, 45, 45]

        //for descending order sort
        Collections.sort(l, Comparator.reverseOrder());
        System.out.println("Sorted descending list: "+ l); //Sorted descending list: [45, 45, 23, 9, 1]

        //To randomly shuffle elements in a collection
        Collections.shuffle(l);
        System.out.println("Randomly shuffle elements" + l); //Randomly shuffle elements[45, 9, 23, 45, 1]
    }
}
