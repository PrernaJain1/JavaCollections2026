package org.example.List;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        //To add the element in arraylist
        numbers.add(10);
        numbers.add(20);
        System.out.println("List: "+numbers);

        //To add the element at particular position
        numbers.add(1,30);
        System.out.println("List after adding the element at particular position: "+numbers);

        //To add one list to another list
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(100);
        newList.add(110);
        newList.add(120);
        System.out.println("New List: "+newList);

        //To update element in the list
        newList.set(1,1000);
        System.out.println("List after update: " +newList);

        //To check if list contains particular value or not
        System.out.println("It contains 50 element or not: "+newList.contains(50));

        //To traverse through list
        for(int i=0;i<newList.size();i++){
            System.out.println("Ele " + newList.get(i));
        }

        numbers.addAll(newList);
        System.out.println("List after merging both list: "+numbers);

        //To get the element from list for a particular index
        System.out.println("Get element from first index: " + numbers.get(1));

        //To remove element from index
        System.out.println("To remove element from 3 index: " + numbers.remove(3) );
        System.out.println(numbers);

        //To remove element from list
        System.out.println(numbers.remove(Integer.valueOf(20)));
        System.out.println(numbers);

        //To remove the whole list
        numbers.clear();
        System.out.println(numbers);

//        List<Integer> numbers1 = new LinkedList<>();
    }
}
