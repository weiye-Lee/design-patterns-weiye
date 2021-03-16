package com.study.behavior.strategy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        QueueStrategy q1 = new ListQueue();
        QueueStrategy q2 = new ArrayQueue(10);
        for (int i = 0; i < 5; i++) {
            q1.in(i);
            q2.in(i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(q1.out());
        }

        System.out.println("_______________");

        for (int i = 0; i < 5; i++) {
            System.out.println(q2.out());
        }


    }
}
