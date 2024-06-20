public class Student extends Osoba implements Studiranje {
    private String broj_indeksa;
    private String naziv_studija;
    private String naziv_fakulteta;
    private int godina_studija;

    public Student() {
        super();
        this.broj_indeksa = "";
        this.naziv_studija = "";
        this.naziv_fakulteta = "";
        this.godina_studija = 0;
    }

    public Student(int id, String ime, String prezime, String adresa, String broj_indeksa, String naziv_studija, String naziv_fakulteta, int godina_studija) {
        super(id, ime, prezime, adresa);
        this.broj_indeksa = broj_indeksa;
        this.naziv_studija = naziv_studija;
        this.naziv_fakulteta = naziv_fakulteta;
        this.godina_studija = godina_studija;
    }

    public String getBroj_indeksa() {
        return broj_indeksa;
    }

    public void setBroj_indeksa(String broj_indeksa) {
        this.broj_indeksa = broj_indeksa;
    }

    public String getNaziv_studija() {
        return naziv_studija;
    }

    public void setNaziv_studija(String naziv_studija) {
        this.naziv_studija = naziv_studija;
    }

    public String getNaziv_fakulteta() {
        return naziv_fakulteta;
    }

    public void setNaziv_fakulteta(String naziv_fakulteta) {
        this.naziv_fakulteta = naziv_fakulteta;
    }

    public int getGodina_studija() {
        return godina_studija;
    }

    public void setGodina_studija(int godina_studija) {
        this.godina_studija = godina_studija;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBroj indeksa: " + broj_indeksa + "\nNaziv studija: " + naziv_studija + "\nNaziv fakulteta: " + naziv_fakulteta + "\nGodina studija: " + godina_studija;
    }

    @Override
    public void upisiUVisu() {
        godina_studija++;
    }
}
