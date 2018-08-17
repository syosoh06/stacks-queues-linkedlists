/*
 *  Soham Chakraborty
 *
 *  This file deals with the testing of a stack in java
 *  by using the Stack class implemented in stack.java.
 *
 * */

package com.company;
public class TestStack {

    public static void main(String args[]) {
        Stack testStack = new Stack(Integer.parseInt(args[0]));

        for(int i = 1; i<=Integer.parseInt(args[0]); i++) {
            testStack.push(i);
        }

        System.out.println("The top of the stack is now -- " + testStack.peek());
        testStack.pop();
        System.out.println("The top of the stack is now -- " + testStack.peek());

        for(int i = 1; i<=7; i++) {
            testStack.pop();
        }

        System.out.println("The top of the stack is now -- " + testStack.peek());
    }
}
