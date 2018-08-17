/*
 *  Soham Chakraborty
 *
 *  This file deals with the testing of a queue in java
 *  by using the queue class.
 *
 * */
package com.company;

public class TestQueue {

    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        QueueADT testQueue = new QueueADT();

        for(int i = 1; i<=size; i ++) {
            testQueue.enQueue(i);
        }

        testQueue.display();

        testQueue.deQueue();
        testQueue.deQueue();

        System.out.println("\nThe queue after deleting the two elements entered first -- ");

        testQueue.display();
    }
}
