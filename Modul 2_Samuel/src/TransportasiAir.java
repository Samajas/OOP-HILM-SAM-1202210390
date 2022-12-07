public class TransportasiAir {
    protected int jumlahkursi;
    protected int biaya;
    protected int kecepatan;
    protected int jangkar;

    public TransportasiAir(int jumlahkursi, int biaya){
        this.jumlahkursi=jumlahkursi;
        this.biaya=biaya;
    }

    public void informasi(){
        System.out.println("Transportasi Air jenis tidak diketahui dengan kursi berjumlah "+jumlahkursi+" ditetapkan dengan biaya sebesar Rp. "+biaya);
    }

    public void berlayar(){
        System.out.println("Transportasi Air jenis tidak diketahui sedang berlayar");
    }

    public void berlabuh(){
        System.out.println("Transportasi Air jenis tidak diketahui berlabuh di pantai");
    }
} 
