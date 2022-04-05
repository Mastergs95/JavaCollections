package com.skillsoft.collections;

import java.util.*;
import java.util.concurrent.Semaphore;

public class Main4 {
    public static void main(String[]args){

        /*Comparator<Product> productComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                int compareName=o1.getName().compareTo(o2.getName());

                if(compareName!=0){
                    return compareName;
                }
                return o1.getCategory().compareTo(o2.getCategory());
            }
        };

         */

        Comparator<String> descendingOrderComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };


        Product phone=new Product("Iphone","Electronics");
        Product tv = new Product("Samsung", "Electronics");

        String[]carsArray=new String[]{"Volvo","BMW","Honda"};
        SortedSet<String> treeSet=new TreeSet<>(descendingOrderComparator);

        treeSet.addAll(Arrays.asList(carsArray));

        for(String name:treeSet){
            System.out.println(name);
        }








    }
}
