package org.example.List;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        //LIFO
        Stack<String> names = new Stack<>();

        //Add data
        names.push("Yellow");
        names.push("Pink");
        names.push("Blue");

        System.out.println(names);

        //To check element present at the top
        System.out.println("Element at top: " + names.peek());

        //To remove element
        System.out.println(names.pop());
        System.out.println(names);



    }
}