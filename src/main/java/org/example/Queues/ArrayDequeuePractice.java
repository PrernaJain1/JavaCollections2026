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

        System.out.println("Printing dequeue: "+ ad);

        System.out.println("Next ele: "+ ad.peekFirst());
        System.out.println("Last ele: "+ad.peekLast());

        System.out.println("Remove first ele: "+ad.removeFirst());
        System.out.println("Remove last ele: "+ ad.removeLast());
        System.out.println("Printing dequeue: "+ ad);





    }
}
