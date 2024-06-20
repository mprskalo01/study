public class Osoba {
    private String ime;
    private String prezime;
    private int id;
    private String adresa;

    public Osoba() {
        this.ime = "";
        this.prezime = "";
        this.id = 0;
        this.adresa = "";
    }

    public Osoba(int id, String ime, String prezime, String adresa) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\nIme: " + ime + "\nPrezime: " + prezime + "\nAdresa: " + adresa;
    }
}
