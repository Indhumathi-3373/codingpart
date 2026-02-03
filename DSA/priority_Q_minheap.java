package DSA;
import java.util.*;
public class priority_Q_minheap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        Collections.reverseOrder();
        pq.add(40);
        pq.add(50);
        pq.add(60);
        pq.add(10);
        while(!pq.isEmpty()){
            System.out.println(pq.poll()+" ");
        }
    }
}
