package org.example.List;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        //insertion order preserved in list, duplicates allowed
        ArrayList<Integer> numbers = new ArrayList<>();
        //To add the element in arraylist
        numbers.add(10);
        numbers.add(20);
        System.out.println("List: "+numbers); //List: [10, 20]

        //To add the element at particular position
        numbers.add(1,30);
        System.out.println("List after adding the element at particular position: "+numbers); // [10, 30, 20]

        //To add one list to another list
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(100);
        newList.add(110);
        newList.add(120);
        System.out.println("New List: "+newList); //New List: [100, 110, 120]

        //To update element in the list
        newList.set(1,1000);
        System.out.println("List after update: " +newList); //List after update: [100, 1000, 120]

        //To check if list contains particular value or not
        System.out.println("It contains 50 element or not: "+newList.contains(50)); //It contains 50 element or not: false

        //To traverse through list
        for(int i=0;i<newList.size();i++){
            System.out.println("Ele " + newList.get(i));
        }

        numbers.addAll(newList);
        System.out.println("List after merging both list: "+numbers); //List after merging both list: [10, 30, 20, 100, 1000, 120]

        //To get the element from list for a particular index
        System.out.println("Get element from first index: " + numbers.get(1)); //Get element from first index: 30

        //To remove element from index
        System.out.println("To remove element from 3 index: " + numbers.remove(3) ); //To remove element from 3 index: 100
        System.out.println(numbers);  // [10, 30, 20, 1000, 120]

        //To remove element from list
        System.out.println(numbers.remove(Integer.valueOf(20))); //true
        System.out.println(numbers); //[10, 30, 1000, 120]

        //To remove the whole list
        numbers.clear();
        System.out.println(numbers); //[]

        //Which method is used to convert a Java List to an array? - toArray()

        //List<Integer> numbers1 = new LinkedList<>();

    }
}
