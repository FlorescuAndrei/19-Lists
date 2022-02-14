package com.andrei.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();

        Customer jj = new Customer("Jane", "Jones");
        Customer jd = new Customer("John", "Doe");
        Customer ms = new Customer("Mary", "Smith");
        Customer mw = new Customer("Mike", "Wilson");

        customerList.add(jj);
        customerList.add(jd);
        customerList.add(ms);
        customerList.add(mw);


//        customerList.forEach(customer -> System.out.println(customer));


//        System.out.println(customerList.get(1));    //every operation which provide an index is done in constant time

//        System.out.println(customerList.isEmpty());

//        customerList.set(1, new com.andrei.Customer("John", "Adams"));
//        customerList.forEach(customer -> System.out.println(customer));

//        System.out.println(customerList.size());

        customerList.add(3, jd);    // the other elements are shifted. O(n) linear time;

        //obtain backing array. return an array of objects
        Object[] customerArray = customerList.toArray();

        //obtain backing array. return an array of customers
        Customer[] customerArray2 = customerList.toArray(new Customer[customerList.size()]);

        for(Customer customer : customerArray2 ){
            System.out.println(customer);
        }

        //contains() method
        //we need equals method in com.andrei.Customer class
        System.out.println(customerList.contains(new Customer("Mary", "Smith")));

        System.out.println(customerList.indexOf(new Customer("John", "Doe")));

        customerList.remove(2); // after remove elements have to be shifted down one position.
        customerList.forEach(customer -> System.out.println(customer));








    }
}
