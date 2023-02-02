package generics_demos.custom_linked_list;

public class LList <T>{
    private Node<T> head;

    public LList(){ head = null;}
    public LList(T data){
        head = new Node<T>(data);
    }

    public void addHead(T data){
        //Add new node with data in front of head
        //Should be three line of code
        Node<T> node = new Node<>(data);
        node.setNext(this.head);
        this.head=node;

    }

    public void insertAfter(Node<T> afterit, T data)
    {
        //Insert a new node with data into the list after the node after it
        //should be three line of code
        Node<T> node = new Node<>(data);
        //set Previous node's next to the current nodes next will drop the cur node
        node.setNext(afterit.getNext());
        afterit.setNext(node);
    }

    public Node<T> findPreviousNode(Node<T> node)
    {
        //Return the Previous node
        //Same idea as find
        return findPreviousNode(this.head,node,null);
    }

    private Node<T> findPreviousNode(Node<T> cur, Node<T> node, Node<T> before)
    {
        if(cur==null) return null;
        if(cur.equals(node)) return before;
        return findPreviousNode(cur.getNext(),node,cur);
    }

    public void remove(Node<T> node)
    {
        //Remove the node and return the node before node
        Node<T> before = findPreviousNode(node);
        if(before!=null)
        {
            before.setNext(node.getNext());
        }
    }

    public void swap(Node<T> node1, Node<T> node2)
    {
        T temp = node1.getData();
        node1.setData(node2.getData());
        node2.setData(temp);

        // Remove node1 ang keep the Previous node of node1
        // remove node2 and keep the Previous node of node2
        //insert them back to the right spot
    }

    public static <E extends Comparable<E>> Node<E> max(LList<E> list)
    {
        return max(list,list.getHead());
    }

    public static <E extends Comparable<E>> Node<E> max(LList<E> list,Node<E> from)
    {
        if(list.getHead()==null) return null;
        Node<E> maxnode = from;
        Node<E> node = from.getNext();
        while(node!=null)
        {
            if(node.getData().compareTo(maxnode.getData())>0) maxnode=node;
            node=node.getNext();
        }
        return maxnode;
    }

    public static <E extends Comparable<E>> Node<E> min(LList<E> list)
    {
        return null;
    }


    //You are not allow to use sort method in your assignment
    public static <E extends Comparable<E>> void sort(LList<E> list)
    {
        //Selection sort
        Node<E> max;
        Node<E> cur = list.getHead();
        while(cur!=null)
        {
            max = LList.max(list,cur);
            if(max!=null && !max.equals(cur)) list.swap(max, cur);
            cur=cur.getNext();
        }
    }

    @Override
    public String toString() {
        //User recursive method to complete toString
        //Reference the idea from find method
        return toString(this.head);
    }

    private String toString(Node<T> cur)
    {
        if(cur==null) return "";
        return cur.toString()+toString(cur.getNext());
    }
    public void addTail(T data){
        Node<T> node = new Node<>(data);
        if(head==null)//The list is empty
            head=node;
        else {
            System.out.printf("%s.setNext(Addtail(%s,%s))\n",head,head.getNext(),node);
            Node<T> rs = addTail(head.getNext(), node);
            System.out.printf("%s.setNext(%s)\n",head,rs==null?"NULL":rs);
            head.setNext(rs);
        }
    }

    private Node<T> addTail(Node<T> curElem, Node<T> newelem)
    {
        if(curElem == null) {
            System.out.printf("At the tail, Return %s\n",newelem);
            return newelem;
        }
        else {
            System.out.printf("%s.setNext(Addtail(%s,%s))\n",curElem,curElem.getNext(),newelem);
            Node<T> rs = addTail(curElem.getNext(),newelem);
            System.out.printf("%s.setNext(%s)\n",curElem,rs==null?"NULL":rs);
            curElem.setNext(rs);
            System.out.printf("Return %s\n",curElem);
            return curElem;
        }
    }

    public void addTailLoop(T data)
    {
        Node<T> node = new Node<>(data);
        if(head==null)//The list is empty
            head=node;
        else {
            Node<T> cur = head;
            while(cur.getNext()!=null)cur=cur.getNext();
            cur.setNext(node);
        }
    }


    public Node<T> getHead() {
        return head;
    }

    public Node<T> find(T data)
    {
        if(this.head==null) return null;
        return find(this.head,data);
    }

    private Node<T> find(Node<T> cur, T data)
    {
        if(cur==null) return null;
        if(cur.getData().equals(data)) return cur;
        return find(cur.getNext(),data);
    }

}