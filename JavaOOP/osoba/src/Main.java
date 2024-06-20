public class Main {
    public static void main(String[] args) {
       Osoba osoba = new Osoba(1, "Ivan", "Ivić", "Mostar b.b.");
       System.out.println("Osoba:");
       System.out.println(osoba);

       Student student = new Student(1, "Ivan", "Ivić", "Mostar b.b.", "12345", "Informatika", "Fakultet informatike", 2);
       System.out.println("\nStudent:");
       System.out.println(student);

       student.upisiUVisu();
       System.out.println("\nNakon upisa u višu godinu:");
       System.out.println(student);
    }
}
