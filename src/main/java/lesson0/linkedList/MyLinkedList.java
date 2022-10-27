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

    public Node<T> getHead(){
        return head;
    }

    public int size(){
        int cnt = 0;
        Node<T> cur = head;

        while (cur != null){
            cnt++;
            cur = cur.next;
        }

        System.out.println("size: " + cnt);
        return cnt;
    }

    public int sizeRecursion(Node<T> curNode, int curSize){
        if(curNode == null) {
            System.out.println("sizeRecursion: " + curSize);
            return curSize;
        }
        return sizeRecursion(curNode.next, curSize+1);
    }

    public void print(){
        Node<T> cur = head;

        while(cur != null){
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
    }
}
