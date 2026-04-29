package org.example;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args){
        int[] n ={1,4,3,7,6};

        //Sort the array
        Arrays.sort(n);

        //Print array
        for(int i:n){
        System.out.println(i);}

        //To fill the same value in the all whole array
        Arrays.fill(n,12);

        //Print array
        for(int i:n){
            System.out.println(i);}


    }
}
