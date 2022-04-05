package com.skillsoft.collections;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Main7 {

    public static void main(String[]args){

        Comparator<Book> bookComparator = new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getName().toLowerCase().compareTo(b2.getName().toLowerCase());
            }
        };

        SortedMap<Book, Double> treeMap= new TreeMap<Book,Double>();

        treeMap.put(new Book("Catcher in the Rye","J. D. Salingner"),4.99);
        treeMap.put(new Book("The great Gatsby","F. Scott Fitz"),4.99);
        treeMap.put(new Book("River","Harper Lee"),5.99);


        System.out.println("Entries in the order of book name: ");



        for(Entry<Book,Double> entry: treeMap.entrySet()){
            System.out.println(entry);
        }
    }
}
