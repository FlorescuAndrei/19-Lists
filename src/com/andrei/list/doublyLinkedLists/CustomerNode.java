package com.andrei.list.doublyLinkedLists;

import com.andrei.list.Customer;

public class CustomerNode {

    private Customer customer;
    private CustomerNode next;
    private CustomerNode previous;

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

    public CustomerNode getPrevious() {
        return previous;
    }

    public void setPrevious(CustomerNode previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return customer.toString();
    }
}
