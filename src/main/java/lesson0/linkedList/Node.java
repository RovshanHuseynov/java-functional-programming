package lesson0.linkedList;

public class Node<T> {
    int value;
    Node<T> next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public Node(int value, Node<T> next) {
        this.value = value;
        this.next = next;
    }
}
