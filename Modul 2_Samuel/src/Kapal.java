public class Kapal extends TransportasiAir {
    protected String mesin;

    public Kapal(int jumlahkursi, int biaya, String mesin){
        super(jumlahkursi,biaya);
        this.mesin=mesin;
    }

    @Override
    public void informasi(){
        System.out.println("Transportasi Air jenis Kapal dengan kursi sebanyak "+jumlahkursi+" ditetapkan dengan biaya Rp."+biaya);
    }

    @Override
    public void berlayar(){
        System.out.println("Transportasi Air jenis Kapal berlayar dengan mesin "+mesin+" dengan kecepatan yang tidak stabil");
        if (mesin=="Yamaha"){
            System.out.println("Semakin di depan!");
        }
        else{}
    }

    public void berlayar(int kecepatan){
        System.out.println("Transportasi Air jenis Kapal berlayar dengan mesin "+mesin+" dengan kecepatan sekitar "+kecepatan+" knot.");
    }

    @Override
    public void berlabuh(){
        System.out.println("Transportasi Air jenis Kapal berlabuh di pantai");
    }
} 
