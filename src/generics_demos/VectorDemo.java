package generics_demos;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class VectorDemo {

    public static void main(String []args){

        Vector<String> vs = new Vector<>();

        Stack<Integer> si = new Stack<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(211);
        pq.add(221);
        pq.add(3);
        pq.add(1911);
        pq.add(991);
        pq.add(6);
        pq.add(22);



        System.out.println(pq);

        test(null);

    }

    public static void test(String []t){

    }

}
