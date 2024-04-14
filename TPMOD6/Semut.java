public class Semut extends Serangga {
    Koordinat posisi;

    public Koordinat getPosisi() {
        return posisi;
    }

    public void setPosisi(Koordinat posisi) {
        this.posisi = posisi;
    }

    public Semut(String color, int x, int y) {
        super(color);
        posisi = new Koordinat(x, y);
    }

    @Override
    public void gerak(int[] axis) {
        posisi.setX(axis[0]);
        posisi.setY(axis[1]);
    }

    @Override
    public void info() {
        System.out.println("Posisi Semut");
        System.out.println("Nilai X : " + posisi.getX());
        System.out.println("Nilai Y : " + posisi.getY());
    }
}
