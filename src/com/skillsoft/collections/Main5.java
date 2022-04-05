package com.skillsoft.collections;

import javax.sql.rowset.CachedRowSet;
import java.util.*;

public class Main5 {
    public static void main(String[]args) {

        /*String[] carsArray = new String[]{"Volvo", "BMW", "Honda"};

        Set<String> hashSet = new HashSet<>(Arrays.asList(carsArray));
        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(carsArray));
        Set<String> treeSet = new TreeSet<>(Arrays.asList(carsArray));

        for (String name : hashSet) {
            System.out.println(name);
        }

        for (String name : linkedHashSet) {
            System.out.println(name);
        }

        for (String name : treeSet) {
            System.out.println(name);
        }



        Integer[] integerArray=new Integer[]{3330,400,100};

        Set<Integer> treeSet= new TreeSet<>(Arrays.asList(integerArray));

        for (Integer integer : treeSet) {
            System.out.println(integer);
        }

         */

        SortedSet<String> vowelSet= new TreeSet<>();

        vowelSet.add("A");
        vowelSet.add("B");
        vowelSet.add("Z");

        System.out.println(vowelSet);
        System.out.println(vowelSet.first());

        System.out.println(vowelSet.headSet("B"));
        System.out.println(vowelSet.tailSet("B"));
        System.out.println(vowelSet.subSet("B","Z"));

    }

}
