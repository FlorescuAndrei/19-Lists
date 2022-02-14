package com.andrei.list;

import java.util.List;
import java.util.Vector;

public class Vectors {
    // Vector is similar with ArrayList but is synchronized

    public static void main(String[] args) {

    List<Customer> customerList = new Vector<>();

    Customer jj = new Customer("Jane", "Jones");
    Customer jd = new Customer("John", "Doe");
    Customer ms = new Customer("Mary", "Smith");
    Customer mw = new Customer("Mike", "Wilson");

    customerList.add(jj);
    customerList.add(jd);
    customerList.add(ms);
    customerList.add(mw);



    }
}
