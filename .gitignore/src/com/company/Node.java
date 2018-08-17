package com.company;

class Node {
     private int value;
     Node Next; // no access modifier - it means default - these variables are accessible inside the package

    Node(int newValue) {
        value = newValue;
        Next = null;
    }

    // the methods you should do public if you want to expose
     // this is a java standard

      int getData() {
        return value;
    }

      void setData(int newValue) {
        value = newValue;
    }

      Node getNext() {
        return Next;
    }

      void setNext(Node next) {
        Next.value = next.value;
        Next.Next = next.Next;
    }
}
