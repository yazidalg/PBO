public abstract class Serangga {
    private final int jmlKaki = 6;
    private String warna;

    public Serangga(String color) {
        this.warna = color;
    }

    public int getJmlKaki() {
        return jmlKaki;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public abstract void gerak(int [] axis);
    public abstract void info();
}
