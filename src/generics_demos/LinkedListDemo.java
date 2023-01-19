package generics_demos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

    public static void main(String []args){

        LinkedList<Integer> llInts = new LinkedList<>();

        llInts.add(1);
        llInts.add(2);
        llInts.add(3);
        llInts.add(4);
        llInts.add(5);

        System.out.println(llInts);

        System.out.println("Last: " + llInts.getLast());
        System.out.println("First: " + llInts.getFirst());

        Iterator<Integer> llIterator = llInts.iterator();
        while (llIterator.hasNext()){
            System.out.println(llIterator.next());
        }

        ListIterator<Integer> listIterator = llInts.listIterator();

    }

}
