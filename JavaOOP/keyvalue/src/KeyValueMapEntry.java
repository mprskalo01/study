import java.util.Map;

public class KeyValueMapEntry<K, V> implements Map.Entry<K, V>{

    private K key;
    private V value;

    public KeyValueMapEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public V setValue(V value) {
        V oldValue = this.value;
        this.value = value;
        return oldValue;
    }

    @Override
    public String toString() {
        return "KeyValueParameterized [key=" + key + ", value=" + value + "]";
    }



}




//public class Main {
//    public static void main(String[] args) {
//        KeyValueMapEntry<Integer, String> kv = new KeyValueMapEntry<>(1, "Dinamo");
//        System.out.println(kv);
//
//        KeyValueMapEntry<String, String> kv2 = new KeyValueMapEntry<>("number one", "Dinamo");
//        System.out.println(kv2);
//
//        KeyValueMapEntry<String, Double> kv3 = new KeyValueMapEntry<>("Dinamo", 0.01d);
//        System.out.println("old value:" + kv3.setValue(100.00));
//        System.out.println(kv3);
//
//    }
//}