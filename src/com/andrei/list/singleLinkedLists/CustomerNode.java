package com.andrei.list.singleLinkedLists;

import com.andrei.list.Customer;

public class CustomerNode {

    private Customer customer;
    private CustomerNode next;

    public CustomerNode(Customer customer){
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CustomerNode getNext() {
        return next;
    }

    public void setNext(CustomerNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return customer.toString();
    }
}
