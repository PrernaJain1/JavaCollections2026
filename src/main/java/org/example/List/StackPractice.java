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

        System.out.println(names); //[Yellow, Pink, Blue]

        //To check element present at the top
        System.out.println("Element at top: " + names.peek()); //Element at top: Blue

        //To remove element
        System.out.println(names.pop()); //Blue
        System.out.println(names);  //[Yellow, Pink]



    }
}