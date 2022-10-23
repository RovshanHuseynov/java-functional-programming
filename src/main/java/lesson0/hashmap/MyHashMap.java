package lesson0.hashmap;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap<K, V> {
    private int capacity;
    private List<List<Node<K,V>>> bucket;

    public MyHashMap() {
        capacity = 16;
        bucket = new ArrayList<>(capacity);
    }

    public void put(K key, V value){
        Node<K, V> newNode = new Node<K, V>(key, value);
        int index = key.hashCode() & (capacity - 1);

        Node<K, V> curNode = bucket.get(index).get(0);
        int i=0;

        do {
            if(curNode == null){
                curNode = newNode;
            } else{
                curNode = curNode.next;
            }
        } while (curNode != null);
    }

    public V get(K key){
        int index = key.hashCode() & (capacity - 1);
        return bucket.get(index).get(0).value;
    }
}
