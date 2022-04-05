package com.skillsoft.collections;

import java.util.*;

public class Main2 {

    public static void main(String[]args){



        /*arrayList.add("EUR");
        arrayList.add("USD");

        System.out.println("ArrayList contents: "+arrayList);

        arrayList.remove("EUR");


        System.out.println("ArrayList contents: "+arrayList);

        System.out.println();
        System.out.println("***********Checking for elements");

        System.out.println("Arraylist contains USD: " + arrayList.contains("USD"));
        System.out.println(arrayList.size());

        System.out.println();

         */

        /*Collection linkedList = new LinkedList();

        System.out.println(linkedList);

        linkedList.add("USD");
        linkedList.add("EUR");
        System.out.println(linkedList);

        linkedList.remove("USD");
        System.out.println(linkedList);

         */

        List list = new ArrayList();

        System.out.println("Adding string elements");

        list.add("EUR");
        list.add("Amazon");
        list.add(12);
        list.add(12);
        list.add("USD");
        list.add(Calendar.getInstance().getTime());

        for (int i=0;i< list.size();i++){
            Object object = list.get(i);

            System.out.println(object);
        }

        int result=(int) list.get(2)+(int)list.get(3);
        System.out.println(result);

    }



}
