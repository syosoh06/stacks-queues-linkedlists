/*
 *  Soham Chakraborty
 *
 *  This file deals with the implementation of a reverseK that takes
as input an instance of Queue (use the above implementation of QueueADT) and
integer K. Then it uses Stack and/or Queue (use the above implementation of
StackADT and QueueADT) to reverse the order of the K elements in the Queue
instance.
 *
 * */

package com.company;

public class QueueReverseK {
    private static QueueADT reverseK(QueueADT originalQueue, int k) {
        Stack stk=new Stack(k);
        int counter=k;
        int size=originalQueue.size();

        while(--counter>=0)
        {
            stk.push(originalQueue.deQueue());

        }

        while(!stk.isEmpty())
        {
            originalQueue.enQueue(stk.pop());
        }

        counter=size-k;

        while(counter-->0)
        {
            originalQueue.enQueue(originalQueue.deQueue());
        }

        return originalQueue;
    }

    public static void main(String args[]) {
        int size = Integer.parseInt(args[0]);
        QueueADT testQueue = new QueueADT();

        for(int i = 1; i<=size; i ++) {
            testQueue.enQueue(i);
        }

        testQueue.display();
        reverseK(testQueue, 4).display();
    }
}

/*
*  The time complexity will be O(n) since there are no nested loops.
*
*  The space complexity is O(n2).
*
* */
