public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahkursi,int biaya,int layar){
        super(jumlahkursi, biaya);
        this.layar=layar;
    }
    
    @Override
    public void informasi(){
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah "+ jumlahkursi +" ditetapkan dengan biaya sebesar Rp."+ biaya);
    }

    @Override
    public void berlayar(){
        System.out.println("Transportasi Air jenis Sampan berlayar dengan "+layar+" layar.");
    }

    @Override
    public void berlabuh(){
        System.out.println("Transportasi Air jenis Sampan berlabuh tanpa menggunakan jangkar");
    }

    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air jenis Sampan berlabuh dengan menggunakan "+jangkar+" jangkar.");
    }
} 
