public class Semut extends Serangga {
    public Semut(Koordinat posisi, String warna) {
        super(posisi, warna);
    }

    @Override
    public void info() {
        System.out.println(this.getPosisi().getX());
        System.out.println(this.getPosisi().getY());
    }

    @Override
    public void gerak(Koordinat koordinat) {
        this.getPosisi().equals(koordinat);
    }
}
