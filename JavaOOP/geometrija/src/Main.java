public class Main {

    public static void main(String[] args) {
        Krug k1 = new Krug();
        Krug k2 = new Krug(5);

        System.out.println(k1.dajOpseg());
        System.out.println(k1.dajPovrsinu());

        System.out.println(k2.dajOpseg());
        System.out.println(k2.dajPovrsinu());
    }
}

//public class Main { ZA CILINDRE
//    public static void main(String[] args) {
//        Cilindar c1 = new Cilindar();
//        Cilindar c2 = new Cilindar(5, 10);
//
//        Tocka t1 = new Tocka(3, 3);
//        Tocka t2 = new Tocka(3, 3);
//
//
//        System.out.println(t1.equals(t2));
//    }
//}
//
//public class Main { ZA LINIJE UDALJENOSTI
//    public static void main(String[] args) {
//        System.out.println("Test123");
//        Metode m = new Metode();
//        int a = m.zbroji(3, 5);
//        System.out.println("Zbroj je " + a);
//
//        Tocka t1 = new Tocka();
//        Tocka t2 = new Tocka(3, 5);
//
//        System.out.println("X je:" + t1.getX());
//
//        double udaljenost = t1.udaljenost(t2);
//        System.out.println("Udaljenost t1 i t2 je:" + udaljenost);
//
//        double udaljenost2 = Tocka.udaljenostStaticka(t1, t2);
//        System.out.println("Udaljenost t1 i t2 je:" + udaljenost2);
//
//
//        Linija l1 = new Linija();
//        System.out.println("Duzina je" + l1.duzina());
//
//        Tocka t3 = new Tocka(3, 5);
//        Tocka t4 = new Tocka(7, 12);
//
//        Linija l2 = new Linija(t3, t4);
//        System.out.println("Duzina je" + l2.duzina());
//
//    }
//
//
//
//}
//public class Main { ZA PRAVOKUTNIKE
//
//    public static void main(String[] args) {
//        try {
//            Pravokutnik p1 = new Pravokutnik(5, 10);
//            System.out.println(p1.povrsina());
//            System.out.println(p1.opseg());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}