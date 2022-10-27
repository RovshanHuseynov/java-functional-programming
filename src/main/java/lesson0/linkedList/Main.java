package lesson0.linkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedListInteger = new MyLinkedList<>();
        linkedListInteger.sizeLoop();
        System.out.println("sizeRecursion: " + linkedListInteger.sizeRecursion(linkedListInteger.getHead()));
        linkedListInteger.addLast(4);
        linkedListInteger.sizeLoop();
        System.out.println("sizeRecursion: " + linkedListInteger.sizeRecursion(linkedListInteger.getHead()));
        linkedListInteger.addLast(3);
        linkedListInteger.sizeLoop();
        System.out.println("sizeRecursion: " + linkedListInteger.sizeRecursion(linkedListInteger.getHead()));
        linkedListInteger.addLast(2);
        linkedListInteger.sizeLoop();
        System.out.println("sizeRecursion: " + linkedListInteger.sizeRecursion(linkedListInteger.getHead()));
        linkedListInteger.addLast(10);

        System.out.println("sizeRecursion: " + linkedListInteger.sizeRecursion(linkedListInteger.getHead()));

        System.out.println("--------------------------------------");
        MyLinkedList<String> linkedListString = new MyLinkedList<>();
        linkedListString.printLoop();
        linkedListString.sizeLoop();
        System.out.println("sizeRecursion: " + linkedListString.sizeRecursion(linkedListString.getHead()));
        linkedListString.addLast("first");
        linkedListString.printLoop();
        linkedListString.sizeLoop();
        System.out.println("sizeRecursion: " + linkedListString.sizeRecursion(linkedListString.getHead()));
        linkedListString.addLast("second");
        linkedListString.printLoop();
        linkedListString.sizeLoop();
        System.out.println("sizeRecursion: " + linkedListString.sizeRecursion(linkedListString.getHead()));
        linkedListString.addLast("third");
        linkedListString.printLoop();
        linkedListString.sizeLoop();
        System.out.println("sizeRecursion: " + linkedListString.sizeRecursion(linkedListString.getHead()));
        linkedListString.addLast("fourth");
        linkedListString.printLoop();
        linkedListString.sizeLoop();
        System.out.println("sizeRecursion: " + linkedListString.sizeRecursion(linkedListString.getHead()));
        linkedListString.addFirst("zero");
        linkedListString.printLoop();
        linkedListString.sizeLoop();
        System.out.println("sizeRecursion: " + linkedListString.sizeRecursion(linkedListString.getHead()));
        System.out.println("removeFirst: " + linkedListString.removeFirst());
        System.out.println("removeFirst: " + linkedListString.removeFirst());
        System.out.println("removeFirst: " + linkedListString.removeFirst());
        System.out.println("removeLast: " + linkedListString.removeLast());
        System.out.println("removeLast: " + linkedListString.removeLast());
        linkedListString.printLoop();
        linkedListString.printRecursion(linkedListString.getHead());
        linkedListString.sizeLoop();
        System.out.println("sizeRecursion: " + linkedListString.sizeRecursion(linkedListString.getHead()));
        System.out.println("isEmpty: " + linkedListString.isEmpty());

        System.out.println("getTail: " + linkedListString.getTail());
        System.out.println("getHead: " + linkedListString.getHead());
    }
}
