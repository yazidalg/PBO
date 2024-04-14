public class Main {
    public static void main(String[] args) {
        Semut semut = new Semut("hitam", 60, 80);
        System.out.println("Warna semut : " + semut.getWarna());
        semut.info();
        semut.gerak(new int[]{70, 90});
        semut.info();
        Lebah lebah = new Lebah("Kuning", 20,30,40);
        System.out.println("Warna Lebah : " + lebah.getWarna());
        lebah.info();
        lebah.Terbang(55, 65, 75);
        lebah.info();
        lebah.gerak(new int[]{25, 35, 45});
        lebah.info();
    }
}
