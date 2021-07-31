import java.util.TreeMap;

public class hashMap<K, V> {
    private TreeMap<K, V>[] hashtable;
    private int M;
    private int size;

    public hashMap(int M) {
        this.M = M;
        size = 0;
        hashtable = new TreeMap[M];
        for (int i = 0; i < M; i++) {
            hashtable[i] = new TreeMap<>();
        }
    }

    public hashMap() {
        this(100);
    }

    private int hash(K key) {
        return key.hashCode() % M;
    }
    private int getSize(){
        return size;
    }
}
