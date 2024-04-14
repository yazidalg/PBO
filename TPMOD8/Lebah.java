public class Lebah extends Serangga {

    public Lebah(Koordinat posisi, String warna) {
        super(posisi, warna);
    }

    @Override
    public void info() {
        System.out.println(this.getPosisi().getX());
        System.out.println(this.getPosisi().getY());
        System.out.println(((Koordinat3D)this.getPosisi()).getZ());
    }

    @Override
    public void gerak(Koordinat koordinat) {
        this.getPosisi().equals(koordinat);
    }
}
