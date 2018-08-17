/*
 *  Soham Chakraborty
 *
 *  This file deals with the testing of a linked list in java
 *  by using the LinkedListADT class.
 *
 * */
package com.company;

public class TestLinkedList {

    public static void main(String args[]) {
        LinkedListADT exampleLinkedList = new LinkedListADT();

        exampleLinkedList.addHead(10);
        exampleLinkedList.addTail(12);
        exampleLinkedList.addHead(13);
        exampleLinkedList.addHead(14);
        exampleLinkedList.addHead(15);
        exampleLinkedList.addTail(16);

        System.out.println("the linked list -- ");
        exampleLinkedList.printLinkedList(exampleLinkedList.getHead());

        System.out.println("\nThe size of the linked list is -- " + exampleLinkedList.count());
        System.out.println("The head of the linked list is -- " + exampleLinkedList.getHead().getData());
        System.out.println("The tail of the linked list is -- " + exampleLinkedList.getTail().getData());

        exampleLinkedList.deleteHead();
        System.out.println("After the head is deleted -- ");
        exampleLinkedList.printLinkedList(exampleLinkedList.getHead());

        exampleLinkedList.deleteTail();
        System.out.println("\nAfter the tail is deleted -- ");
        exampleLinkedList.printLinkedList(exampleLinkedList.getHead());
    }
}
