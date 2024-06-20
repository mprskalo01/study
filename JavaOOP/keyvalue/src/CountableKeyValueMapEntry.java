public class CountableKeyValueMapEntry<V> extends KeyValueMapEntry<Integer, V> {

    private static int counter = 0;

    private int id;

    public CountableKeyValueMapEntry(Integer key, V value) {
        super(key, value);
        id = counter++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return super.toString()+ " id:"+id;
    }

}