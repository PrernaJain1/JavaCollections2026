package org.example;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args){
        int[] n ={1,4,3,7,6};

        //Sort the array
        Arrays.sort(n); //1 3 4 6 7

        //Print array
        for(int i:n){
        System.out.print(i+" ");}

        System.out.println();

        //To fill the same value in the all whole array
        Arrays.fill(n,12);

        //Print array
        for(int i:n){
            System.out.print(i +" ");} //12 12 12 12 12


    }
}
