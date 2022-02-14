package com.andrei.list.doublyLinkedLists;


import com.andrei.list.Customer;

public class CustomerDoubleLinkedList {
    private CustomerNode head;
    private CustomerNode tail;
    private int size;

    public void addToFront(Customer customer){
        CustomerNode node = new CustomerNode(customer);

        if(head == null){
            tail = node;
        }else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public void addToEnd(Customer customer){
        CustomerNode node = new CustomerNode(customer);

        if(head == null){
            head = node;
        }else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public CustomerNode removeFromFront(){
        if (isEmpty()){
            return null;
        }

        //check if it is the only node in the list
        if(head.getNext() == null){
            tail = null;
        }else {
            head.getNext().setPrevious(null);
        }

        CustomerNode removeNode = head;
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public CustomerNode removeFromEnd(){
        if(isEmpty()){
            return null;
        }

        CustomerNode removeNode = tail;

        //check if it is the only node in the list ( can be replaced with the code above)
        if(tail.getPrevious() == null){
            head = null;
        }else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();

        size--;
        removeNode.setPrevious(null);
        return removeNode;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }


    public void print(){
        CustomerNode current = head;
        System.out.print("Head ->");
        while(current != null){
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNext();
        }
        System.out.println("tail");
    }
}
