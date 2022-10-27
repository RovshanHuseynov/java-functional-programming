package lesson0.linkedList;

public class MyLinkedList<T> {
    private Node<T> head;

    public void addLast(T value){
        Node<T> newNode = new Node<>(value);

        if(head == null){
            head = newNode;
        } else {
            Node<T> cur = head;
            while (cur.next != null){
                cur = cur.next;
            }
            cur.next = newNode;
        }

        System.out.println("addLast: " + value);
    }

    public void addFirst(T val){
        Node<T> newNode = new Node<>(val);

        if(head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    public T getTail(){
        if(head == null) return null;

        Node<T> cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        return cur.value;
    }

    public boolean removeFirst() {
        if(head == null) return false;

        head = head.next;
        return true;
    }

    public boolean removeLast(){
        return false;
    }

    public Node<T> getHead(){
        return head;
    }

    public int sizeLoop(){
        int cnt = 0;
        Node<T> cur = head;

        while (cur != null){
            cnt++;
            cur = cur.next;
        }

        System.out.println("size: " + cnt);
        return cnt;
    }

    public int sizeRecursion(Node<T> curNode){
        if(curNode == null) {
            return 0;
        }
        return 1 + sizeRecursion(curNode.next);
    }

    public void printLoop(){
        System.out.print("LinkedList: ");
        Node<T> cur = head;

        while(cur != null){
            System.out.print(cur.value + ", ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void printRecursion(){

    }

    public boolean isEmpty(){
        return head == null;
    }
}
