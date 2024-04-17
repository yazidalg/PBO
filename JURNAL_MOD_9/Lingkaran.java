public class Lingkaran extends BangunDatar {
    private int jari;
    public Lingkaran(String nama, int jari) {
        super(nama);
        this.jari = jari;
    }

    @Override
    public double hitungKeliling() {
        return 3.14 * ( 2 * jari );
    }

    @Override
    public double hitungLuas() {
        return 3.14 * Math.sqrt(jari);
    }

    public int getJari() {
        return jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }
}
