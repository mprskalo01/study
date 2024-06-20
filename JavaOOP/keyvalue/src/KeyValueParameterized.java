public class KeyValueParameterized<K, V>{

    private K key;
    private V value;

    public KeyValueParameterized(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyValueParameterized [key=" + key + ", value=" + value + "]";
    }



}





//public class Main {
//    public static void main(String[] args) {
//        KeyValueParameterized<Integer, String> kv = new KeyValueParameterized<>(1, "Dinamo");
//        System.out.println(kv);
//
//        KeyValueParameterized<String, String> kv2 = new KeyValueParameterized<>("number one", "Dinamo");
//        System.out.println(kv2);
//
//        KeyValueParameterized<String, Double> kv3 = new KeyValueParameterized<>("Dinamo", 0.01d);
//        double oldValue = kv3.getValue();
//        kv3.setValue(100.00);
//        System.out.println("old value:" + oldValue);
//        System.out.println(kv3);
//
//    }
//}