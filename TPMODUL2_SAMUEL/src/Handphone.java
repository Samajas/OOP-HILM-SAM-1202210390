public class Handphone  extends Perangkat{
    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    public void informasi() {
        if (fingerprint) {
            System.out.println("Handphone ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz. Handphone ini memiliki pemindai sidik jari");
        }
        else{
            System.out.println("Handphone ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz. Handphone ini tidak memiliki pemindai sidik jari");
        }
    }

    public void telfon(int no_hp) {
        System.out.println("Handphone berhasil menyambungkan telfon ke no "+no_hp);
    }

    public void kirimSMS(int no_hp) {
        System.out.println("Handphone berhasil mengirim SMS ke no "+no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2) {
        System.out.println("Handphone berhasil mengirim SMS ke no "+no_hp1+" dan ke no "+no_hp2);
    }

    public void kirimSMS(int no_hp1, int no_hp2, int no_hp3) {
        System.out.println("Handphone berhasil mengirim SMS ke nomor "+no_hp1+", nomor "+no_hp2+", dan ke no "+no_hp3);
    }
}