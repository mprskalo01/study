public class Trokut implements Oblik{
    private Tocka a;
    private Tocka b;
    private Tocka c;

    @Override
    public double dajOpseg() {
        return a.udaljenost(b) + b.udaljenost(c) + c.udaljenost(a);
    }

    @Override
    public double dajPovrsinu() {
        double s = this.dajOpseg() / 2;

        double d1 = a.udaljenost(b);
        double d2 = b.udaljenost(c);
        double d3 = c.udaljenost(a);

        return Math.sqrt(s*(s-d1)*(s-d2)*(s-d3));
    }
}