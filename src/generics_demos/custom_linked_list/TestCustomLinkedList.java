package generics_demos.custom_linked_list;

public class TestCustomLinkedList {

    public static void main(String[] args) {

        // create an instance of custom linked list
        CustomLinkedList<Integer> list = new CustomLinkedList<>();

        // add a new node at the tail of the linked list [at end of the list]
        list.addTail(1);
        System.out.println("1 Added\n");

        // add a new node at the tail of the linked list [at end of the list]
        list.addTail(2);
        System.out.println("2 Added\n");

        // add a new node at the tail of the linked list [at end of the list]
        list.addTail(3);
        System.out.println("3 Added\n");

        // add a new node at the tail of the linked list [at end of the list]
        list.addTail(4);
        System.out.println("4 Added\n");
    }

}

