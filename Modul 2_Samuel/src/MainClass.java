public class MainClass {
    public static void main(String[] args) throws Exception {
        TransportasiAir objektransportasi = new TransportasiAir(4,20000);
        objektransportasi.informasi();
        objektransportasi.berlayar();
        objektransportasi.berlabuh();
        System.out.println("");

        Sampan objeksampan = new Sampan(10,5000,2);
        objeksampan.informasi();
        objeksampan.berlayar();
        objeksampan.berlabuh();
        objeksampan.berlabuh(3);
        System.out.println("");

        Kapal objekkapal = new Kapal(50,25000,"Yamaha");
        objekkapal.informasi();
        objekkapal.berlayar();
        objekkapal.berlayar(35);
        objekkapal.berlabuh();
        System.out.println("");
    }
} 
