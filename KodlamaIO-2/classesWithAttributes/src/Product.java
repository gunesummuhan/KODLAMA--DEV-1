public class Product {

    public Product(int id, String name, String description, double price, int stockAmont, String renk){
        System.out.println("Yapıcı blok çalıştı");
        //contructor kısmı
        this.description=description;
        this.price=price;
        this.stockAmont=stockAmont;
        this.renk=renk;
        this.name=name;
        this.id=id;

    }
    public Product(){}


    //attributes / fields
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmont;
    private String renk;
    private String kod;

    //getter
    public int getId(){
        return id;
    }
    //setter
    public void setId(int id){
        this.id=id;

        // this.id olunca bu productın içindeki id olduğunu anlamasını sağlıyoruz.
        // _id=id; bu da aynı işlevi görüyor.
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmont() {
        return stockAmont;
    }

    public void setStockAmont(int stockAmont) {
        this.stockAmont = stockAmont;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
        //kodu kullanıcının yazmasını engellemiş olduk sadece getter var.
    }

}
