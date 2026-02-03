package DSA;

import java.util.Collections;
import java.util.PriorityQueue;

public class priority_Q_maxheap {
       public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());//descending order
        
        pq.add(40);
        pq.add(50);
        pq.add(60);
        pq.add(10);
        while(!pq.isEmpty()){
            System.out.println(pq.poll()+" ");
        }
    }
}
