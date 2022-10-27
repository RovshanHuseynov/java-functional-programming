package lesson0.linkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedListInteger = new MyLinkedList<>();
        linkedListInteger.size();
        linkedListInteger.sizeRecursion(linkedListInteger.getHead(), 0);
        linkedListInteger.addLast(4);
        linkedListInteger.size();
        linkedListInteger.sizeRecursion(linkedListInteger.getHead(), 0);
        linkedListInteger.addLast(3);
        linkedListInteger.size();
        linkedListInteger.sizeRecursion(linkedListInteger.getHead(), 0);
        linkedListInteger.addLast(2);
        linkedListInteger.size();
        linkedListInteger.sizeRecursion(linkedListInteger.getHead(), 0);
        linkedListInteger.addLast(10);

        System.out.println("getTail: " + linkedListInteger.getTail());

        System.out.println("--------------------------------------");
        MyLinkedList<String> linkedListString = new MyLinkedList<>();
        linkedListString.print();
        linkedListString.size();
        linkedListString.sizeRecursion(linkedListString.getHead(), 0);
        linkedListString.addLast("first");
        linkedListString.print();
        linkedListString.size();
        linkedListString.sizeRecursion(linkedListString.getHead(), 0);
        linkedListString.addLast("second");
        linkedListString.print();
        linkedListString.size();
        linkedListString.sizeRecursion(linkedListString.getHead(), 0);
        linkedListString.addLast("third");
        linkedListString.print();
        linkedListString.size();
        linkedListString.sizeRecursion(linkedListString.getHead(), 0);
        linkedListString.addLast("fourth");
        linkedListString.print();
        linkedListString.size();
        linkedListString.sizeRecursion(linkedListString.getHead(), 0);
        linkedListString.addFirst("zero");
        linkedListString.print();
        linkedListString.size();
        linkedListString.sizeRecursion(linkedListString.getHead(), 0);

        System.out.println("getTail: " + linkedListString.getTail());
        System.out.println("getHead: " + linkedListString.getHead());
    }
}
