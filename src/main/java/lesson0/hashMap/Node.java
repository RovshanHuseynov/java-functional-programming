package lesson0.hashMap;

public class Node<K,V> {
    K key;
    V value;
    int hashCode;
    Node<K,V> next;

    public Node(K key, V value){
        this.key = key;
        this.value = value;
        this.hashCode = key.hashCode();
        this.next = null;
    }

    public Node(K key, V value, Node<K,V> next) {
        this.key = key;
        this.value = value;
        this.hashCode = key.hashCode();
        this.next = next;
    }

    public Node(K key, V value, int hashCode, Node<K,V> next) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
        this.next = next;
    }
}
