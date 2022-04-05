package com.skillsoft.collections;

import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class Main6 {
    public static void main(String[]args){

        Comparator<String> descendingOrderComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2)*-1;
            }
        };

        SortedMap<String, String> treeMap= new TreeMap<String,String>(descendingOrderComparator);

        treeMap.put("Leonardo","Titanic");
        treeMap.put("Brad Pit","Interstellar");
        treeMap.put("Van gogh","Casablanca");
        treeMap.put("Rockslaw","Back to the Future");

        System.out.println("Entries in the reverse order: ");



        for(Entry<String,String> entry: treeMap.entrySet()){
            System.out.println(entry);
        }



    }
}
