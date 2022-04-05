package com.skillsoft.collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class Main8 {
    public static void main(String[]args){

        SortedMap<Integer,String> treeMap=new TreeMap<>();

        treeMap.put(1202,"Sam");
        treeMap.put(1300,"Tom");
        treeMap.put(1404,"Dan");

        System.out.println(treeMap);

        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());

        System.out.println("All keys strictly less than 1501: " + treeMap.headMap(1501));
        System.out.println("All keys greater than or equal to 1501: " + treeMap.tailMap(1501));
        System.out.println("All keys greater than or equal to 1501 and less than 1555: " + treeMap.subMap(1501,1555));


    }
}
