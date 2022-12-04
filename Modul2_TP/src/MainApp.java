public class MainApp
 {
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Kingston",4,2.4f);
        perangkat.informasi();
        System.out.println();

        Laptop laptop = new Laptop("Seagate",20,4.50f,false);
        laptop.informasi();
        laptop.bukaGame("GTA V");
        laptop.kirimEmail("akuhkamu@selamanya.as.ik");
        laptop.kirimEmail("akuhkamu@selamanya.as.ik", "halokakak.semoga@kabarnya.ba.ik");
        System.out.println();
        
        Handphone handphone = new Handphone("Sandisk",8,3.50f,true);
        handphone.informasi();
        handphone.telfon(628221234);
        handphone.kirimSMS(628123456);
        handphone.kirimSMS(628123456, 628112233);
        handphone.kirimSMS(628123456, 628112233, 628110011);;
    }
}