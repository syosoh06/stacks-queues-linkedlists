/*
*  Soham Chakraborty
*
*  This file deals with the implementation of a linked list in java
*  which is later re-used for other files in this project
*
* */

package com.company;

class LinkedListADT {
    private Node head;
    private Node tail;

    LinkedListADT() {
        head = null;
        tail = null;
    }

     void addHead(int val) {
        Node newNode = new Node(val);

        if (head == null) {

            newNode.Next = null;

            head = newNode;

            tail = newNode;

        } else {

            newNode.Next = head;

            head = newNode;

        }
    }

     void addTail(int val) {
        Node newNode = new Node(val);

        if (head == null) {

            head = newNode;

            tail = newNode;

        } else {

            tail.Next = newNode; // why do we need this ?

            tail = newNode;

        }
    }

     int deleteTail() {
         Node n = tail;

        if(tail == null) {
            throw new NullPointerException("Linked list is empty");
        } else if(head == tail) {
            head = null;
            tail = null;
        } else {
            Node current = head;

            while(current.getNext() != tail) {
                current = current.Next;
            }

            tail = current;
            tail.Next = null;
        }

        return n.getData();
    }

     int deleteHead() {
        Node n = head;

        if(head == null) {
            throw new NullPointerException("Linked list is empty");
        }

        if(head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.Next;
        }

        return n.getData();
    }

     int count() {
        int size = 0;

        Node n = head;

        while(n != null) {
           n = n.Next;
           size ++;
        }

        return size;
    }

    /* Function to print linked list */
    void printLinkedList(Node head)
    {
        if (head == null) return;

        // print list of head node
        printLinkedList(head.getNext());

        // After everything else is printed
        System.out.print(head.getData()+" ");
    }

     Node getHead() {
        return head;
    }

     Node getTail() {
     return tail;
    }
}
