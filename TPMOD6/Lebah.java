public class Lebah extends Serangga implements BisaTerbang {
    Koordinat3D posisi;

    public Lebah(String color, int x, int y, int z) {
        super(color);
        posisi = new Koordinat3D(x,y,z);
    }

    @Override
    public void Terbang(int x, int y, int z) {
        posisi.setX(posisi.getX() + x);
        posisi.setY(posisi.getY() + y);
        posisi.setZ(posisi.getZ() + z);
    }

    @Override
    public void gerak(int[] axis) {
        posisi.setX(axis[0]);
        posisi.setY(axis[1]);
        posisi.setZ(axis[2]);
    }

    @Override
    public void info() {
        System.out.println("Posisi Lebah : ");
        System.out.println("Nilai X : " + posisi.getX());
        System.out.println("Nilai Y : " + posisi.getY());
        System.out.println("Nilai Z : " + posisi.getZ());
    }
}
