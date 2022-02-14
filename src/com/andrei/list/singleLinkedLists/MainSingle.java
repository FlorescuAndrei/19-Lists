package com.andrei.list.singleLinkedLists;

import com.andrei.list.Customer;

public class MainSingle {
    public static void main(String[] args) {

        Customer jj = new Customer("Jane", "Jones");
        Customer jd = new Customer("John", "Doe");
        Customer ms = new Customer("Mary", "Smith");
        Customer mw = new Customer("Mike", "Wilson");

        CustomerLinkedList list = new CustomerLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(jj);
        list.addToFront(jd);
        list.addToFront(ms);
        list.addToFront(mw);

        System.out.println(list.getSize());
        list.print();

        list.removeFromFront();

        System.out.println(list.getSize());
        list.print();

    }


}
