/*
 *  Soham Chakraborty
 *
 *  This file deals with the implementation of a stack in java
 *  which is later re-used for other files in this project
 *
 * */
package com.company;

class Stack {

    private int top;

    private int[] storage;



    Stack(int capacity) {

        if (capacity <= 0)

            throw new IllegalArgumentException("Stack's capacity must be positive");

        storage = new int[capacity];

        top = -1;

    }



    void push(int value) {

        if (top == storage.length)

            throw new StackException("Stack's underlying storage is overflow");

        top++;

        storage[top] = value;

    }



    int peek() {

        if (isEmpty())

            throw new StackException("Stack is empty");

        return storage[top];

    }



    int pop() {
        int stackTop = storage[top];

        if (isEmpty())

            throw new StackException("Stack is empty");

        top--;

        return stackTop;
    }



    boolean isEmpty() {

        return (top == -1);

    }



    private class StackException extends RuntimeException {

        private StackException(String message) {

            super(message);

        }

    }

}