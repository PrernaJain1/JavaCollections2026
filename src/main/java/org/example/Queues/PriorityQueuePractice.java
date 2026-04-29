package org.example.Queues;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePractice {
    public static void main(String[] args){
        Queue<Integer> pq = new PriorityQueue<>(); //Min heap

        //Add element
        pq.offer(160);
        pq.add(210);
        pq.add(10);
        pq.add(100);
        System.out.println("Printing priority queue: "+ pq); //Smallest element will be printed first

        //Remove element
        System.out.println("Remove the smallest element: "+pq.remove());
        System.out.println("Printing priority queue: "+ pq);

        //next element in queue
        System.out.println("Next Element: "+pq.peek());

        //We want the largest number priority to be more
        Queue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        //Add element
        pq1.offer(160);
        pq1.add(210);
        pq1.add(10);
        pq1.add(100);
        System.out.println("Printing priority queue Max heap: "+ pq1); //Largest element will be printed first


    }



}
