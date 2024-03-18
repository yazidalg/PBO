import java.lang.Override;

public class Koordinat3D extends Koordinat {
    private int z;

    Koordinat3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public double hitungJarak(Koordinat k) {
        double kZ = this.z - z;
        return super.hitungJarak(k) + Math.sqrt(Math.pow(kZ, 2));
    }
}
