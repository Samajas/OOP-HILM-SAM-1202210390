public class Laptop extends Perangkat{
    protected boolean webcam;

    public Laptop(String drive,int ram,float processor,boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    public void informasi() {
        if (webcam) {
            System.out.println("Laptop ini memiliki drive bertipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz. Laptop ini memiliki Webcam");
        }
        else{
            System.out.println("Laptop ini memiliki drive bertipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz. Laptop ini tidak memiliki Webcam\nUdah beli mahal-mahal gadapet webcam :(");
        }
    }

    public void bukaGame(String nama_game) {
        System.out.println("Laptop berhasil membuka game "+nama_game);
        if (nama_game=="GTA V") {
            System.out.println("Laptop mulai panas :(");
        }
        else{
            System.out.println("Gamingg kut");
        }
    }

    public void kirimEmail(String email) {
        System.out.println("Laptop berhasil mengirim email ke "+email);
    }

    public void kirimEmail(String email1, String email2) {
        System.out.println("Laptop berhasil mengirim email ke "+email1+" dan ke "+email2);
    }
}