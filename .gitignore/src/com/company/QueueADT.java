/*
 *  Soham Chakraborty
 *
 *  This file deals with the implementation of a queue in java
 *  which is later re-used for other files in this project
 *
 * */
package com.company;

import java.util.NoSuchElementException;

class QueueADT
{
    private LinkedListADT items;

    /* Constructor */
     QueueADT()
    {
        items = new LinkedListADT();
    }

    /*  Function to check if queue is empty */
     boolean isEmpty()
    {
        return items.count() == 0;
    }

    void enQueue(int val) {
         items.addTail(val);
    }

    int deQueue() {
         if(isEmpty()) {
             throw new NoSuchElementException("Underflow Exception");
         }

         return items.deleteHead();
    }

    int size() {
         return items.count();
    }

    /*  Function to display the status of the queue */
     void display()
    {
        System.out.print("\nQueue = ");
        if (size() == 0)
        {
            System.out.print("Empty\n");
            return ;
        }

        items.printLinkedList(items.getHead());
    }

}