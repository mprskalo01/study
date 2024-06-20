public class Main {

    public static void main(String[] args) {

        int primitive = 5;
        System.out.println("Primitive:"+primitive);

        // a)
        Integer objectWrapper = Integer.valueOf(primitive);
        System.out.println("Object:"+objectWrapper.toString());

        // b)
        int primitiveFromObject = objectWrapper.intValue();
        System.out.println("Primitive from object:"+primitiveFromObject);

        // c)
        Integer automaticObjectWrapper = primitive;
        System.out.println("Automatic object:"+automaticObjectWrapper.toString());
        int automaticPrimitive = automaticObjectWrapper;
        System.out.println("Automatic primitive:"+automaticPrimitive);

        // d)
        Integer ohNo = null;
        System.out.println(ohNo);
        // problem:
        int ohNoPrimitive = ohNo;
        System.out.println(ohNoPrimitive);

    }

}









//
//import java.util.Iterator;
//public class Main {
//
//    public static void main(String[] args) {
//
//        KeyValueMapEntry<Integer, String> real = new KeyValueMapEntry<>(5, "Real Madrid");
//        KeyValueMapEntry<Integer, String> dinamo = new KeyValueMapEntry<>(3, "Dinamo");
//        KeyValueMapEntry<Integer, Boolean> fake = new KeyValueMapEntry<>(1, false);
//        KeyValueMapEntry<Integer, Double> fake2 = new KeyValueMapEntry<>(1, 99.00);
//        System.out.println(calculateAverageKey(real, dinamo, fake, fake2));
//
//
//    }
//
//    public static <K extends Number> double calculateAverageKey(KeyValueMapEntry<K, ?> ...entries ) {
//        double sum = 0;
//        int cnt = 0;
//        for (KeyValueMapEntry<K, ?> entry : entries) {
//            K key = entry.getKey();
//            sum+= key.doubleValue();
//            cnt++;
//        }
//
//        return sum/cnt;
//    }
//
//}


//public class Main {
// countablemap
//    public static void main(String[] args) {
//
//        KeyValueMapEntry<Integer, String> real = new KeyValueMapEntry<>(5, "Real Madrid");
//        KeyValueMapEntry<Integer, String> dinamo = new KeyValueMapEntry<>(3, "Dinamo");
//        //KeyValueMapEntry<Integer, Boolean> fake = new KeyValueMapEntry<>(1, false);
//        //KeyValueMapEntry<Double, String> fake2 = new KeyValueMapEntry<>(1.0d, "Varazdin");
//        System.out.println(calculateAverageKey(real, dinamo));//, fake, fake2)); // we cannot add fake and fake2 because their parameters are not "aligned" with parameters from "real"
//
//
//    }
//
//    public static <K extends Number, V> double calculateAverageKey(KeyValueMapEntry<K, V> ...entries ) {
//        double sum = 0;
//        int cnt = 0;
//        for (KeyValueMapEntry<K, ?> entry : entries) {
//            K key = entry.getKey();
//            sum+= key.doubleValue();
//            cnt++;
//        }
//
//        return sum/cnt;
//    }
//
//}

