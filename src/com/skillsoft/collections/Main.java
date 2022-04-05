package com.skillsoft.collections;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {



       /* String[] companies = {"Amazon", "Google","Microsoft","Facebook"};

        System.out.println(Arrays.toString(companies));

        System.out.println();

       for(int i=0;i<companies.length;i++){
           System.out.format("companies[%d]: %s",i,companies[i]);
           System.out.println();
       }

       for(String company:companies){
           System.out.format("company: %s",company);
           System.out.println();
       }


        Object [] mixedArray={"Amazon",100.0f,23,true};

        System.out.println(Arrays.toString(mixedArray));
        System.out.println();

        for (Object element : mixedArray){
            System.out.format("element class: %s", element.getClass());
            System.out.println();

            System.out.format("element: %s", element);
            System.out.println();
        }

        */

        private static String[] stringArray=new String[5];
        private static int lastIndex=0;

        private static void addString(String element){
            if(lastIndex>=stringArray.length){
                System.out.println("Cannot add element!");
                return;
        }
            stringArray[lastIndex++]=element;

    }

    private static void deleteString(int index){
            if(index>=stringArray.length){
                System.out.println("Index out of bounds!");
                return;
            }
            stringArray[index]=null;

            int currentIndex=index;

            for(int i=currentIndex; i<stringArray.length-1;i++){
                stringArray[currentIndex]=stringArray[currentIndex+1];
                currentIndex++;
            }
            lastIndex--;
    }

    public static void main(String[]args){

            String [][] multidimensionalStringArray=new String[2][];

            multidimensionalStringArray[0]=new String[2];
            multidimensionalStringArray[1]=new String[3];

            for(String[] stringArray:multidimensionalStringArray){
                System.out.println(Arrays.toString(stringArray));
            }


    }
}
