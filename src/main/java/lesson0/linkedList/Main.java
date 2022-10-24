package lesson0.linkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.size();
        linkedList.addLast(4);
        linkedList.size();
        linkedList.addLast(3);
        linkedList.size();
        linkedList.addLast(2);
        linkedList.size();
        linkedList.addLast(10);

        System.out.println("GetTail: " + linkedList.getTail());
    }
}