package lesson0.tree;

public class Tree {
    Node head;

    public void add(int value){
        System.out.println("--------------------------");
        System.out.println("add: " + value);
        Node newNode = new Node(value);

        if(head == null) head = newNode;
        else {
            Node cur = head;

            while (true) {
                System.out.println("cur " + cur.value);
                if (value < cur.value) {
                    if (cur.left == null) {
                        System.out.println("sola yaz " + value);
                        cur.left = newNode;
                        break;
                    } else {
                        cur = cur.left;
                    }
                } else {
                    if (cur.right == null) {
                        System.out.println("saga yaz " + value);
                        cur.right = newNode;
                        break;
                    } else {
                        cur = cur.right;
                    }
                }
            }
        }
    }
}
