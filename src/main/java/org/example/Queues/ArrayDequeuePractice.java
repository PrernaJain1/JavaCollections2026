package org.example.Queues;

import java.util.ArrayDeque;

public class ArrayDequeuePractice {
    public static void main(String[] args){
        //Doubly ended queue - can enter and remove element from start and end both
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.add(12);
        ad.add(2);
        ad.add(22);
        ad.addFirst(30); //Will add the element at first
        ad.addLast(100); //Will add the element at last

        System.out.println("Printing dequeue: "+ ad);  //Printing dequeue: [30, 12, 2, 22, 100]

        System.out.println("Next ele: "+ ad.peekFirst());  //Next ele: 30
        System.out.println("Last ele: "+ad.peekLast());   //Last ele: 100

        System.out.println("Remove first ele: "+ad.removeFirst());  //Remove first ele: 30
        System.out.println("Remove last ele: "+ ad.removeLast());   //Remove last ele: 100
        System.out.println("Printing dequeue: "+ ad);     //Printing dequeue: [12, 2, 22]






    }
}
