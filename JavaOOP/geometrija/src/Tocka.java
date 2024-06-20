public class Tocka {
    private int x = 0;
    private int y = 0;

    // Konstruktor
    public Tocka() {
        System.out.println("Pozvan konstruktor 1");
    }

    // Konstruktor 2
    public Tocka(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Pozvan konstruktor 2");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double udaljenost(Tocka t) {
        return Math.sqrt(Math.pow(this.x-t.getX(), 2) + Math.pow(this.y - t.getY(), 2));
    }

    public static double udaljenostStaticka(Tocka t1, Tocka t2) {
        return Math.sqrt(Math.pow(t1.getX()-t2.getX(), 2) + Math.pow(t1.getY() - t2.getY(), 2));
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
        //return super.toString();
    }

    public boolean equals(Tocka t) {
        return this.x == t.x && this.y == t.y;
        //return super.equals(obj);
    }
}