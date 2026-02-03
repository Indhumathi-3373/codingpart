package DSA;
import java.util.*;
class patient implements Comparable<patient>{
    String name;
    int prioriy;
    
    patient(String name,int priority ){
this.name=name;
this.prioriy=priority;
    }
    public int CompareTo(patient p){
        return this.priority - p.priority;
        
    }
}
public class hospital_ES_PQ {
    public static void main(String[] args) {
        PriorityQueue<patient> pq=new PriorityQueue<>(Collections.reverseOrder());
    pq.add(new patient("serious",2));
    pq.add(new patient("normal",3));
    pq.add(new patient("critical",1));
    while(!pq.isEmpty()){
        patient p=pq.poll();
        System.out.println(p.name+" patient treated");
    }
    }
}
