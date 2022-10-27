package lesson0.linkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedListInteger = new MyLinkedList<>();
        linkedListInteger.size();
        System.out.println("sizeRecursion: " + linkedListInteger.sizeRecursion(linkedListInteger.getHead()));
        linkedListInteger.addLast(4);
        linkedListInteger.size();
        System.out.println("sizeRecursion: " + linkedListInteger.sizeRecursion(linkedListInteger.getHead()));
        linkedListInteger.addLast(3);
        linkedListInteger.size();
        System.out.println("sizeRecursion: " + linkedListInteger.sizeRecursion(linkedListInteger.getHead()));
        linkedListInteger.addLast(2);
        linkedListInteger.size();
        System.out.println("sizeRecursion: " + linkedListInteger.sizeRecursion(linkedListInteger.getHead()));
        linkedListInteger.addLast(10);

        System.out.println("sizeRecursion: " + linkedListInteger.sizeRecursion(linkedListInteger.getHead()));

        System.out.println("--------------------------------------");
        MyLinkedList<String> linkedListString = new MyLinkedList<>();
        linkedListString.print();
        linkedListString.size();
        System.out.println("sizeRecursion: " + linkedListString.sizeRecursion(linkedListString.getHead()));
        linkedListString.addLast("first");
        linkedListString.print();
        linkedListString.size();
        System.out.println("sizeRecursion: " + linkedListString.sizeRecursion(linkedListString.getHead()));
        linkedListString.addLast("second");
        linkedListString.print();
        linkedListString.size();
        System.out.println("sizeRecursion: " + linkedListString.sizeRecursion(linkedListString.getHead()));
        linkedListString.addLast("third");
        linkedListString.print();
        linkedListString.size();
        System.out.println("sizeRecursion: " + linkedListString.sizeRecursion(linkedListString.getHead()));
        linkedListString.addLast("fourth");
        linkedListString.print();
        linkedListString.size();
        System.out.println("sizeRecursion: " + linkedListString.sizeRecursion(linkedListString.getHead()));
        linkedListString.addFirst("zero");
        linkedListString.print();
        linkedListString.size();
        System.out.println("sizeRecursion: " + linkedListString.sizeRecursion(linkedListString.getHead()));

        System.out.println("getTail: " + linkedListString.getTail());
        System.out.println("getHead: " + linkedListString.getHead());
    }
}
