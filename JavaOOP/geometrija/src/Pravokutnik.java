import java.util.ArrayList;

public class Pravokutnik extends GrafickiObjekt{
    private float a;
    private float b;

    public ArrayList<Integer> ocjene;

    public Pravokutnik(float a, float b) throws Exception {
        if (a < 1 || b <1) {
            throw new Exception("Uneseni parametri nisu valjani.");
        }
        this.a = a;
        this.b = b;
    }

    @Override
    float povrsina() {
        return a*b;
    }

    @Override
    float opseg() {
        return 2*a + 2*b;
    }
}