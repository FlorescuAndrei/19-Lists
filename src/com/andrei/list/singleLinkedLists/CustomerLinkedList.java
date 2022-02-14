package com.andrei.list.singleLinkedLists;


import com.andrei.list.Customer;

public class CustomerLinkedList {
    private CustomerNode head;      //will be initialized to null so we don't need to create a constructor.
    private int size;

    public void addToFront(Customer customer){
        CustomerNode node = new CustomerNode(customer);
        node.setNext(head);
        head = node;
        size++;
    }

    public CustomerNode removeFromFront(){
        if (isEmpty()){
            return null;
        }
        CustomerNode removeNode = head;
        head = head.getNext();
        size--;
        removeNode.setNext(null);
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
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
