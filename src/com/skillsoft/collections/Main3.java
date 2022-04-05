package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;

public class Main3 {
    public static void main(String[]args){

        /*ArrayList<Car> carList=new ArrayList<>();

        carList.add(new Car("Honda","Civic",21000.0));
        carList.add(new Car("Toyota","Camry",30000.0));

        System.out.println(carList);

        ArrayList nonGenericCarList = new ArrayList<>();

        nonGenericCarList.add(new Car("Honda","Civic",21000.0));
        nonGenericCarList.add(new Car("Toyota","Camry",30000.0));

        for(Car car:carList){
            System.out.format("%s, %s, %.1f", car.getMake(),car.getModel(),car.getPrice());
            System.out.println();
        }
        System.out.println();

        for(Object object: nonGenericCarList) {
            Car car = (Car) object;

            System.out.format("%s, %s, %.1f", car.getMake(), car.getModel(), car.getPrice());
            System.out.println();
        }

        Car car=carList.get(1);
        System.out.println(car);

        System.out.println();

        car=(Car)nonGenericCarList.get(1);
        System.out.println(car);

         */

        List<String> cityList =new ArrayList<>();

        cityList.add("Bengaluru");
        cityList.add("New York");
        cityList.add("Mumbai");

        System.out.println("cityList contents: " + cityList);

        System.out.println();

        Iterable<String> cityListIterable = cityList;

        for(String city: cityListIterable){
            System.out.println(city);
        }
        System.out.println();

        Iterator<String> iterator = cityList.iterator();

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

      /*  cityList.add(2,"Seattle");
        cityList.add(4,"Seattle");

        System.out.println(cityList);
        System.out.println(cityList.get(0));
        System.out.println(cityList.indexOf("Seattle"));
        System.out.println(cityList.lastIndexOf("Seattle"));

       */











    }
}
