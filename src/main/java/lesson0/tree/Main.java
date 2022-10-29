package lesson0.tree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(4);
        tree.add(2);
        tree.add(1);
        tree.add(3);
        tree.add(10);
        tree.add(9);
        tree.add(16);

        tree.printInOrderTraversal(tree.head);
        System.out.println();
        tree.printPostOrderTraversal(tree.head);
        System.out.println();
    }
}
