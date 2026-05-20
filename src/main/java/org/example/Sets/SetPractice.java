package org.example.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
    public static void main(String[] args){
        //Duplicates not allowed - hashset, linked hashset, Treeset
        //Insertion Order not preserved

        Set<Integer> set = new HashSet<>(); //Order of elements will be random, Complexity- O(1)
        //Add Elements
        set.add(10);
        set.add(45);
        set.add(32);
        set.add(47);
        set.add(47); //If I am trying to add duplicate element won't give any error

        System.out.println("Hash Set: "+set);  //Output: "Hash Set: [32, 10, 45, 47]"

        System.out.println("Remove element : " + set.remove(32)); //Remove element : true
        System.out.println(set);  //[10, 45, 47]
        System.out.println("Contain ele or not: " + set.contains(45)); //Contain ele or not: true
        System.out.println("If set is empty or not : " + set.isEmpty()); //If set is empty or not : false
        System.out.println("Size of set: " + set.size()); //Size of set: 3
        System.out.println("To clear the set: ");
        set.clear();

        Set<Integer> linkedHashSet = new LinkedHashSet<>(); //Order of elements will be linked to each other
        //Add Elements
        linkedHashSet.add(10);
        linkedHashSet.add(45);
        linkedHashSet.add(32);
        linkedHashSet.add(47);
        System.out.println("Linked Hash set: " + linkedHashSet); //Output: "Linked Hash set: [10, 45, 32, 47]"

        System.out.println("Remove element : " + linkedHashSet.remove(32));
        System.out.println(linkedHashSet);
        System.out.println("Contain ele or not: " + linkedHashSet.contains(45));
        System.out.println("If set is empty or not : " + linkedHashSet.isEmpty());
        System.out.println("Size of set: " + linkedHashSet.size());
        System.out.println("To clear the set: ");
        linkedHashSet.clear();

        Set<Integer> treeSet= new TreeSet<>(); //Unique elements and all the elements will be sorted,Complexity- O(log n)
        //Add Elements
        treeSet.add(10);
        treeSet.add(45);
        treeSet.add(32);
        treeSet.add(47);
        System.out.println("Tree set: " + treeSet);  //Output: "Tree set: [10, 32, 45, 47]"
    }
}
