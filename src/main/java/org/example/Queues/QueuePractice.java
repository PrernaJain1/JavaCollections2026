package org.example.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
        //FIFO
        Queue<Integer> queue = new LinkedList<>();

        //To add elements - add,offer
        queue.offer(10);
        queue.offer(20);
        queue.offer(30); //If ele not added successfully it will return true or false
        queue.add(40);      //If ele not added successfully will throw the exception
        System.out.println(queue);

        //To remove element -poll,remove
        System.out.println("Ele to be removed: " + queue.poll());   //return null
        System.out.println("Ele to be removed: " + queue.remove()); //throw exception
        System.out.println("Queue after removing ele: " +queue);

        //Element next in line - peek, element
        System.out.println("Next Element : " + queue.peek()); //If no ele there will return null
        System.out.println("Next ele: " + queue.element()); //If no ele there will throw exception


    }
}
