package com.andrei.list;

import java.util.Iterator;
import java.util.LinkedList;

public class JDKLinkedList {
    //it is a Doubly Linked List implementation

    public static void main(String[] args) {

        Customer jj = new Customer("Jane", "Jones");
        Customer jd = new Customer("John", "Doe");
        Customer ms = new Customer("Mary", "Smith");
        Customer mw = new Customer("Mike", "Wilson");

        Customer be = new Customer("Bill", "End");

        LinkedList<Customer> list = new LinkedList<>();

        list.addFirst(jj);
        list.addFirst(jd);
        list.addFirst(ms);
        list.addFirst(mw);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("*********");

        //same thing
//        for(Customer customer : list){
//            System.out.println(customer);
//        }

        //add at the end
        list.add(be);

       iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("*********");

        list.removeFirst();

        iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("*********");

        list.removeLast();

        iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("*********");


    }
}
