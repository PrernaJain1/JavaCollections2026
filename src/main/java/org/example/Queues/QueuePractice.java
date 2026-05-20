package org.example.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
        //FIFO
        Queue<Integer> queue = new LinkedList<>();

        //To add elements - add,offer
        queue.offer(10);
        queue.offer(120);
        queue.offer(30); //If ele not added successfully it will return true or false
        queue.add(401);      //If ele not added successfully will throw the exception
        System.out.println(queue); //[10, 120, 30, 401]

        //To remove element -poll,remove
        System.out.println("Ele to be removed: " + queue.poll());   //return null          //Ele to be removed: 10
        System.out.println("Ele to be removed: " + queue.remove()); //throw exception     // Ele to be removed: 120
        System.out.println("Queue after removing ele: " +queue);    //Queue after removing ele: [30, 401]

        //Element next in line - peek, element
        System.out.println("Next Element : " + queue.peek()); //If no ele there will return null     //Next Element : 30
        System.out.println("Next ele: " + queue.element()); //If no ele there will throw exception  //Next ele: 30

    }
}
