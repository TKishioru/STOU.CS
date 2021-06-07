public class Product{
	
    String id,name,desc,img;
    int price;
    
    public Product() {
    }
    public Product(String id, String name, String desc, int price,String img) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.img = img;
        this.price = price;
        System.out.println("Imported product, " + id + " " + name);
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
    public String getImg() {
        return img;
    }
    public int getPrice() {
        return price;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        System.out.println("> SetName");
        this.name = name;
    }
    public void setDesc(String desc) {
        System.out.println("> SetDesc");
        this.desc = desc;
    }
    public void setImg(String img) {
        System.out.println("> SetImg");
        this.img = img;
    }
    public void setPrice(int price) {
        System.out.println("> SetPrice");
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", desc=" + desc + ", img=" + img + ", price=" + price + '}';
    }    
}
