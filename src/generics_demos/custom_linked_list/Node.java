package generics_demos.custom_linked_list;

public class Node<T> {
    private T data;
    private Node<T> next;

    @Override
    public String toString() {
        return String.format("[%s -> %s]",
                data.toString(), next == null ? "NULL" : next.getData());
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
        System.out.println("Node created: " + this);
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return this.next;
    }
}