package generics_demos.custom_linked_list;

public class CustomLinkedList<T> {
    // the head [start] node of the linked list
    private Node<T> head;

    // default constructor [initializing the head to null]
    public CustomLinkedList() {
        head = null;
    }

    // constructor to initialize the head to a new node with provided data
    public CustomLinkedList(T data) {
        head = new Node<T>(data);
    }

    // adding [appending] a new node to the list
    public void addTail(T data) {

        // create a new node with the provided data
        Node<T> node = new Node<>(data);

        // if the list is empty, make the new node the head node
        if (head == null)//The list is empty
            head = node;
        else {
            System.out.printf("%s.setNext( addTail(%s,%s) )\n", head, head.getNext(), node);

            // if head is not null i.e. the list is not empty then
            // add the new node to the tail of the list
            Node<T> rs = addTail(head.getNext(), node);

            System.out.printf("%s.setNext(%s)\n", head, rs == null ? "NULL" : rs);

            // once added, set the next reference appropriately
            head.setNext(rs);
        }
    }

    public Node<T> addTail(Node<T> curElement, Node<T> newElement) {

        // if the current node is null i.e. empty, then
        // return the new node as the current node
        if (curElement == null) {
            System.out.printf("At the tail, Return %s\n", newElement);
            return newElement;
        } else {

            System.out.printf("%s.setNext( addTail(%s,%s) )\n", curElement, curElement.getNext(), newElement);

            // if the current node is not empty, then
            // traverse till the tail of the list
            Node<T> rs = addTail(curElement.getNext(), newElement);

            System.out.printf("%s.setNext(%s)\n", curElement, rs == null ? "NULL" : rs);

            // and
            // add the new node to the next part of the last node of the list
            curElement.setNext(rs);
            System.out.printf("Return %s\n", curElement);

            // after properly adding, return the current node
            return curElement;
        }
    }

    // the add tail logic implemented using loop
    public void addTailLoop(T data) {
        Node<T> node = new Node<>(data);
        if (head == null)//The list is empty
            head = node;
        else {
            Node<T> cur = head;
            while (cur.getNext() != null) cur = cur.getNext();
            cur.setNext(node);
        }
    }

}
