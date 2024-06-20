public class Linija {
    private Tocka t1 = new Tocka();
    private Tocka t2 = new Tocka(1, 2);

    public Linija() {
        super();
    }

    public Linija(Tocka t1, Tocka t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public Tocka getT1() {
        return t1;
    }

    public Tocka getT2() {
        return t2;
    }

    public double duzina() {
        return t1.udaljenost(t2);
    }
}