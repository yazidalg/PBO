public abstract class Serangga {
    private Koordinat posisi;
    private String warna;

    public Serangga(Koordinat posisi, String warna) {
        this.posisi = posisi;
        this.warna = warna;
    }
    public Koordinat getPosisi() {
        return posisi;
    }
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }

    public abstract void info();

    public abstract void gerak(Koordinat koordinat);
}
