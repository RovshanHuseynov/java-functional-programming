package lesson0.linkedList;

public class MyLinkedList<T> {
    private Node<T> head;

    public void addLast(int value){
        Node<T> newNode = new Node<>(value);

        if(head == null){
            head = newNode;
        } else {
            Node<T> cur = head;
            while (true){
                if(cur.next == null){
                    cur.next = newNode;
                    break;
                }
                cur = cur.next;
            }
        }

        System.out.println("addLast: " + value);
    }

    public int getTail(){
        if(head == null) return -1;

        Node<T> cur = head;

        while (true){
            if(cur.next == null) return cur.value;
            cur = cur.next;
        }
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

    public Node<T> getHead(){
        return head;
    }
}
