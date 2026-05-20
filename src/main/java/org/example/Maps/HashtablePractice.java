package org.example.Maps;

import java.util.Hashtable;
import java.util.Map;

public class HashtablePractice {
    public static void main(String[] args){
        //Hashtable doesn't allow null key or value   --> Hashmap allow one null as key and value any number of null
        //Hashtable Synchronized  -->  hashmap not synchronized
        //hashtable slower than hashmap
        //Legacy class
        //hashtable thread safe --> hashmap not thread safe
        //Hashtable insertion order not preserved
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1,"Orange");
        ht.put(5,"Banana");
        ht.put(2,"Apple");
        ht.put(3,"Mango");
        System.out.println(ht);  //{5=Banana, 3=Mango, 2=Apple, 1=Orange}
        ht.remove(2);
        System.out.println(ht); //{5=Banana, 3=Mango, 1=Orange}
        System.out.println(ht.contains("Orange"));  //true

        for(Map.Entry<Integer,String> s: ht.entrySet()){
            System.out.println(s.getKey());
        }
    }

}
