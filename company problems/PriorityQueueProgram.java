// Priority Queue has functionality of storing value based on priority (large value has less priority and small value has more priority)
import java.util.*;

class PriorityQueueProgram{
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(80);
        pq.add(90);
        pq.add(10);
        pq.add(20);
        pq.add(5);
        pq.add(45);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq);

    }
}