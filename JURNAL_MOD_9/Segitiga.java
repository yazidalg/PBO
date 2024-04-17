public class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;

    public Segitiga(String nama, int alas, int tinggi) {
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungKeliling() {
        double sisi = Math.sqrt((alas * alas) + (tinggi * tinggi));
        return sisi * 2 + alas;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * (alas * tinggi);
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}
