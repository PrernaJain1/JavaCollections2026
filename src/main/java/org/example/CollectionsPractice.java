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

        System.out.println("Printing list: "+l);
        //To get the minimum element in collection
        System.out.println("Min ele in collection: "+Collections.min(l));
        //To get the max element in collection
        System.out.println("Max ele in collection: "+ Collections.max(l));
        //To get the frequency of element in collection
        System.out.println("Frequency: "+ Collections.frequency(l,45));
        //To sort
        Collections.sort(l);
        System.out.println("Sorted list: "+ l);
        //for descending order sort
        Collections.sort(l, Comparator.reverseOrder());
        System.out.println("Sorted descending list: "+ l);

        //To randomly shuffle elements in a collection
        Collections.shuffle(l);
        System.out.println("Randomly shuffle elements" + l);


    }
}
