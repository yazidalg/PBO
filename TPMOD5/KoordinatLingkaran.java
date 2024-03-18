public class KoordinatLingkaran extends Koordinat {
    double r;

    KoordinatLingkaran(int x, int y, double r) {
        super(x, y);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public boolean isBersinggungan(KoordinatLingkaran k) {
        double center = this.hitungJarak(k);
        double totalPhi = this.r + k.r;
        return (center <= totalPhi);
    }
}
