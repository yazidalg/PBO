public class Koordinat {
    private int x;
    private int y;

    Koordinat(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double hitungJarak(Koordinat k) {
        double kX = this.x - k.getX();
        double kY = this.y - k.getY();

        return Math.sqrt(Math.pow(kX, 2) + Math.pow(kY, 2));
    }
}
