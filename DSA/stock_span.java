package DSA;
import java.util.*;
public class stock_span {
    public static void calculatespan(int price[]){
int n=price.length;
int span[]=new int[n];
Stack<Integer> st=new Stack<>();
st.add(0);
span[0]=1;
for(int i=1;i<n;i++){
    while(!st.isEmpty() && price[st.peek()]<=price[i])
        st.pop();
    span[i]=st.isEmpty()?i+1:i-st.peek();
    
}System.out.println("span : "+Arrays.toString(span));
    }public static void main(String[] args){
        int[] price={100,80,60,70,60,75,85,115,1000};
        calculatespan(price);
    }
}
