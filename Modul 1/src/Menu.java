public class Menu {
    // TODO Create Attribute of Menu; Name, Category, and Price then Create Setter
    String Name;
    String Category;
    byte Price;

    public void getName(String name){
        this.Name = name;
    }

    public void getCategory(String category){
        this.Category = category;
    }

    public void getPrice(byte price){
        this.Price = price;
    }

    public void showDatabase(String name, String category, byte price){
        System.out.println("Nama pelanggan : ",getName(name));
        System.out.println("Jenis makanan : ",getCategory(category));
        System.out.println("Harga makanan : Rp",getPrice(price));
    }
}

