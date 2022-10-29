package lesson0.tree;

public class Tree {
    Node head;

    public void add(int value){
        Node newNode = new Node(value);

        if(head == null) head = newNode;
        else {
            Node cur = head;

            while (true) {
                if (value < cur.value) {
                    if (cur.left == null) {
                        cur.left = newNode;
                        break;
                    } else {
                        cur = cur.left;
                    }
                } else {
                    if (cur.right == null) {
                        cur.right = newNode;
                        break;
                    } else {
                        cur = cur.right;
                    }
                }
            }
        }
    }

    public void printInOrderTraversal(Node cur){
        if(cur == head) System.out.print("printInOrder: ");

        if(cur.left != null) printInOrderTraversal(cur.left);
        System.out.print(cur.value + " ");
        if(cur.right != null) printInOrderTraversal(cur.right);
    }

    public void printPostOrderTraversal(Node cur){
        if(cur == head) System.out.print("printPostOrderTraversal: ");

        if(cur.left != null) printPostOrderTraversal(cur.left);
        if(cur.right != null) printPostOrderTraversal(cur.right);
        System.out.print(cur.value + " ");
    }
}