package lesson0.hashmap;

public class MyHashMap<K, V> {
    private final int capacity;
    private final Node<K, V>[] buckets;

    public MyHashMap() {
        this.capacity = 16;
        this.buckets = new Node[capacity];
    }

    public void put(K key, V value) {
        Node<K, V> newNode = new Node<>(key, value);
        int index = Math.abs(key.hashCode() & (capacity - 1));

        if (buckets[index] == null) {
            buckets[index] = newNode;
        } else {
            Node<K, V> cur = buckets[index];
            do {
                if (cur.key.equals(key)) {
                    // eyni key-dirsə, sadəcə value dəyişmək lazımdırsa
                    cur.value = value;
                    break;
                } else if (cur.next == null) {
                    // key fərqlidirsə, sadəcə hashCode-u olan key-ə rast gəlmişiksə
                    cur.next = newNode;
                }

                cur = cur.next;
            } while (cur.next != null);
        }
    }

    public V get(K key) {
        int index = key.hashCode() & (capacity - 1);
        Node<K, V> cur = buckets[index];

        while(cur != null){
            if(cur.key.equals(key)){
                return cur.value;
            }
            cur = cur.next;
        }

        return null;
    }
}
