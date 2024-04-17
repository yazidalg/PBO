public class PersegiPanjang extends BangunDatar {
    private int lebar;
    private int panjang;

    public PersegiPanjang(String nama, int lebar, int panjang) {
        super(nama);
        this.lebar = lebar;
        this.panjang = panjang;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
}
