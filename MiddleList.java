/*
 *  Soham Chakraborty
 *
 *  This file deals with the implementation of a middle list algorithm in java
 *   that takes a LinkedListADT object (using the above class) and integer k as parameters and prints
 *   middle element + K elements’ data in the LinkedList.
 *
 * */

package com.company;

public class MiddleList {
    public static void main(String args[]) {
        LinkedListADT exampleLinkedList = new LinkedListADT();

        exampleLinkedList.addHead(1);
        exampleLinkedList.addHead(2);
        exampleLinkedList.addHead(3);
        exampleLinkedList.addHead(4);
        exampleLinkedList.addHead(5);
        exampleLinkedList.addHead(6);
        exampleLinkedList.addHead(7);
        exampleLinkedList.addHead(8);
//        exampleLinkedList.addHead(9);


        System.out.println("Linked list elements: ");
        exampleLinkedList.printLinkedList(exampleLinkedList.getHead());
        System.out.println("\nK = " + 2);
        System.out.println("Output = ");
        middleList(exampleLinkedList, 2);
    }

    private static void middleList(LinkedListADT exampleLinkedList, int k) {
        Node n = exampleLinkedList.getHead();
        int counter = 1;
        int size = exampleLinkedList.count();

        while(counter < (size/2 + k)) {
            if (counter > k) {
                System.out.print(n.getData() + ((n.Next != null) ? ", " : "\n"));
            }
            n = n.Next;
           counter ++;
        }
    }

    /*
     *  The time complexity will be O(n) since there are no nested loops.
     *
     *  The space complexity is O(n).
     *
     * */
}
