public class KeyValueBasic {

    private int key;
    private String value;

    public KeyValueBasic(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyValueBasic [key=" + key + ", value=" + value + "]";
    }



}





//public class Main {
//
//    public static void main(String[] args) {
//        KeyValueBasic kv = new KeyValueBasic(1, "Dinamo");
//        System.out.println(kv);
//    }
//
//}