package com.company;

import java.util.Deque;

public class Test {
    public static void testSize(){

        Queue q = new Queue();

        if(q.size() == 0){

            System.out.println("zero size test passed");

        }else System.out.println("zero size test failed");

        q.enqueue(1);

        q.enqueue(2);

        if(q.size() == 2){

            System.out.println("not zero size test passed");

        }else System.out.println("not zero size test failed");

        System.out.println();

    }

    public static void testEnqueue(){

        Queue q = new Queue();

        int n = 3;

        for(int i = 0; i < n; i++){

            q.enqueue(i);

        }

        if(q.size() == 3){

            System.out.println("enqueue test passed");

        }else System.out.println("enqueue test failed");

        System.out.println();

    }

    public static void testDequeue(){

        Queue q = new Queue();

        if(q.dequeue() == null){

            System.out.println("null stack dequeue test passed");

        }else System.out.println("null stack dequeue test failed");

        q.enqueue(10);

        for(int i = 0; i < 3; i++){

            q.enqueue(i);

        }

        if((int)q.dequeue() == 10){

            System.out.println("not null stack dequeue test passed");

        }else System.out.println("not null stack dequeue test passed");

        System.out.println();

    }

    /*public static void testStackSize(){

        QueueStack q = new QueueStack();

        if(q.queueSize() == 0){

            System.out.println("zero stack size test passed");

        }else System.out.println("zero stack size test failed");

        q.enqueue(1);

        q.enqueue(2);

        if(q.queueSize() == 2){

            System.out.println("not zero stack size test passed");

        }else System.out.println("not zero stack size test failed");

        System.out.println();

    }*/

    /*public static void testStackEnqueue(){

        QueueStack q = new QueueStack();

        int n = 3;

        for(int i = 0; i < n; i++){

            q.enqueue(i);

        }

        if(q.queueSize() == 3){

            System.out.println("enqueue stack test passed");

        }else System.out.println("enqueue stack test failed");

        System.out.println();

    }*/

    /*public static void testStackDequeue(){

        QueueStack q = new QueueStack();

        if(q.dequeue() == null){

            System.out.println("null stack dequeue test passed");

        }else System.out.println("null stack dequeue test failed");

        q.enqueue(10);

        for(int i = 0; i < 3; i++){

            q.enqueue(i);

        }

        if((int)q.dequeue() == 10){

            System.out.println("not null stack dequeue test passed");

        }else System.out.println("not null stack dequeue test passed");

        System.out.println();

    }*/

    public static void allTests(){

        testSize();

        testEnqueue();

        testDequeue();

        //testStackSize();

        //testStackEnqueue();

        //testStackDequeue();

    }

    public  static void main(String[] args){
        allTests();
    }

    /*public static void testSizeDeq(){

        Deque dq = new Deque();

        int size = 5;

        for(int i = 0; i<size; i++){

            dq.addLast(i);

        }

        if(dq.dequeSize() == size){

            System.out.println("deque size test passed");

        }else System.out.println("deque size test failed");

    }*/

    /*public static void testAddFirst(){

        Deque dq = new Deque();

        Object f = 1;

        for(int i = 0; i<3; i++){

            dq.addLast(i);

        }

        int s1 = dq.dequeSize();

        dq.addFirst(f);

        int s2 = dq.dequeSize();

        if((dq.peekFirst() == f)&&(s1+1 == s2)){

            System.out.println("add/peek first test passed");

        }else System.out.println("add/peek first test failed");

    }*/

    /*public static void testAddLast(){

        Deque dq = new Deque();

        Object f = 1;

        for(int i = 0; i<3; i++){

            dq.addLast(i);

        }

        int s1 = dq.dequeSize();

        dq.addLast(f);

        int s2 = dq.dequeSize();

        if((dq.peekLast() == f)&&(s1+1 == s2)){

            System.out.println("add/peek last test passed");

        }else System.out.println("add/peek last test failed");

    }*/

    /*public static void testPopLast(){

        Deque dq = new Deque();

        Object f = 1;

        for(int i = 0; i<3; i++){

            dq.addLast(i);

        }

        dq.addLast(f);

        int s1 = dq.dequeSize();

        Object last = dq.popLast();

        int s2 = dq.dequeSize();

        if((last == f)&&(s1-1 == s2)){

            System.out.println("pop last test passed");

        }else System.out.println("pop last test failed");

    }*/

    /*public static void testPopFirst(){

        Deque dq = new Deque();

        Object f = 1;

        for(int i = 0; i<3; i++){

            dq.addLast(i);

        }

        dq.addFirst(f);

        int s1 = dq.dequeSize();

        Object last = dq.popFirst();

        int s2 = dq.dequeSize();

        if((last == f)&&(s1-1 == s2)){

            System.out.println("pop first test passed");

        }else System.out.println("pop first test failed");

    }*/

    /*public static void testPopNull(){

        Deque dq = new Deque();

        if((dq.popLast() == null)&&(dq.popFirst() == null)){

            System.out.println("pop first/last test passed");

        }else System.out.println("pop first/last test failed");

    }*/
}
