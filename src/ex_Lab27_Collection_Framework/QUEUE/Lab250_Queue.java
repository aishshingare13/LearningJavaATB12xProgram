package ex_Lab27_Collection_Framework.QUEUE;

import java.util.PriorityQueue;

public class Lab250_Queue {
    public static void main(String[] args) {
        // Queue -> 0.001% in Automation
        // FIFO
        PriorityQueue q = new PriorityQueue();
        q.add("Aishwarya");
        q.add("Shingare");
        System.out.println(q); // natural sorting

        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);

    }
}
