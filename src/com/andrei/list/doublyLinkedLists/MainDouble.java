package com.andrei.list.doublyLinkedLists;

import com.andrei.list.Customer;

public class MainDouble {
    public static void main(String[] args) {

        Customer jj = new Customer("Jane", "Jones");
        Customer jd = new Customer("John", "Doe");
        Customer ms = new Customer("Mary", "Smith");
        Customer mw = new Customer("Mike", "Wilson");

        CustomerDoubleLinkedList list = new CustomerDoubleLinkedList();


        list.addToFront(jj);
        list.addToFront(jd);
        list.addToFront(ms);
        list.addToFront(mw);

        System.out.println(list.getSize());
        list.print();

        Customer be = new Customer("Bill", "End");

        list.addToEnd(be);
        System.out.println(list.getSize());
        list.print();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.print();

        list.removeFromEnd();
        System.out.println(list.getSize());
        list.print();





    }


}
