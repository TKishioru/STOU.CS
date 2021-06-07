
import java.util.HashMap;
import java.util.Iterator;

public class ProductService extends Product {

    static HashMap<String, Product> map = new HashMap<>();
    static HashMap<String, String> cart_id = new HashMap<>();
    static int i = 0;

    public ProductService() {
    }

    public ProductService(String id, String name, String desc, int price, String img) {
        super(id, name, desc, price, img);
    }

    public static HashMap<String, String> getCart_id() {
        return cart_id;
    }

    public static HashMap<String, Product> getMap() {
        return map;
    }

    public static int getI() {
        return i;
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
    //4) เปลี่ยนแปลงข้อมูลของสินค้า เช่น ราคาสินค้า, ชื่อสินค้า, คำอธิบายสินค้า,ชื่อไฟล์รูปสินค้า

    public static void setCart_id(HashMap<String, String> cart_id) {
        ProductService.cart_id = cart_id;
    }

    public static void setMap(HashMap<String, Product> map) {
        ProductService.map = map;
    }

    public static void setI(int i) {
        ProductService.i = i;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void addProduct(Product adder) {
        //1) เพิ่มสินค้าลงในคลังสินค้า
        map.put(adder.getName(), adder);
        cart_id.put(adder.getId(), adder.getName());
        System.out.println("\tAdd : " + adder.getName());
        i++;
    }

    public void removeProduct(Product remover) {
        //5) ลบสินค้าออกจากคลังสินค้า
        if (map.containsValue(remover)) {
            System.out.println("\tRemove : " + remover.getName());
            map.remove(remover.getName());
            cart_id.remove(remover.getId());
            i--;
        } else {
            System.out.println("\tNo This Product");
        }
    }

    public void listProduct() {
        //3) แสดงข้อมูลของสินค้าทั้งหมด
        System.out.println("--------listProduct --------");
        for (Iterator<Product> it = map.values().iterator(); it.hasNext();) {
            Product key = it.next();
            System.out.println("\t" + key);
        }
    }

    public String searchProductByName(String name) {
        //2) ค้นหาสินค้าจากชื่อสินค้า
        if (map.containsKey(name)) {
            //System.out.print("Found This Product : ");
            return "" + map.get(name);
        } else {
            return "Not Found This Product";
        }
    }
        public String searchProductincart(String name) {
        //2) ค้นหาสินค้าจากชื่อสินค้า
        if (map.containsKey(name)) {
            return "" + map.get(name);
        } else {
            return "Not Found This Product";
        }
    }
    public String searchProductById(String id) {
        //2) ค้นหาสินค้าจากชื่อสินค้า
        //System.out.println(cart_id.entrySet() + "********" + id);
        if (cart_id.containsKey(id)) {
           
            return "" + map.get(cart_id.get(id));
        } else {
            return "Not Found This Product";
        }
    }
}
