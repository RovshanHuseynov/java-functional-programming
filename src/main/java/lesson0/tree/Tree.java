package lesson0.tree;

public class Tree {
    Node head;

    public void addLoop(int value){
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

    public void addRecursion(Node cur, int value){
        Node newNode = new Node(value);

        if(cur == head && cur == null) {
            head = newNode;
            return;
        }

        if(value < cur.value){
            if(cur.left == null){
                cur.left = newNode;
            } else {
                addRecursion(cur.left, value);
            }
        } else {
            if(cur.right == null){
                cur.right = newNode;
            } else {
                addRecursion(cur.right, value);
            }
        }
    }

    public void printPreOrderTraversal(Node cur){
        if(cur == head) System.out.print("printPreOrderTraversal: ");

        System.out.print(cur.value + " ");
        if(cur.left != null) printPreOrderTraversal(cur.left);
        if(cur.right != null) printPreOrderTraversal(cur.right);
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