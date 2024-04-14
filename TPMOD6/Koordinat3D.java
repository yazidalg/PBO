public class Koordinat3D extends Koordinat{
    private int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Koordinat3D(int y, int x, int z) {
        super(y, x);
        this.z = z;
    }
}
