public class Main {
    public static void main(String[] args) {

        Serangga l = new Semut(new Koordinat(20,20),"hijau");
        System.out.println("Serangga");
        l.getWarna();
        l.info();
        l.gerak(new Koordinat(30,40));
        System.out.println("Updated :");
        l.info();
        System.out.println("");
        l = new Lebah(new Koordinat3D(11,20,30),"kuning");
        System.out.println("Lebah");
        l.getWarna();
        l.info();
        l.gerak((Koordinat)new Koordinat3D(20,30,40));
        System.out.println("Updated :");
        l.info();

    }
}
