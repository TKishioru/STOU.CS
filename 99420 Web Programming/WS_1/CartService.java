
import java.util.HashMap;
import java.util.Iterator;

public class CartService {

    static HashMap<String, Cart> map_id = new HashMap<>();
    static HashMap<String, Product> map_name = new HashMap<>();
    String id;
    static int i = 0;

    public CartService() {
        System.out.println("CartService");
    }

    public CartService(String id) {
        System.out.println("CartService");
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static HashMap<String, Cart> getMap_id() {
        return map_id;
    }

    public static HashMap<String, Product> getMap_name() {
        return map_name;
    }

    public static int getI() {
        return i;
    }

//4) เปลี่ยนแปลงข้อมูลของตะกร้า เช่น สินค้า::id ชื่อ ราคา - ลูกค้า::id ชื่อ
    public static void setMap_id(HashMap<String, Cart> map_id) {
        CartService.map_id = map_id;
    }

    public static void setMap_name(HashMap<String, Product> map_name) {
        CartService.map_name = map_name;
    }

    public static void setI(int i) {
        CartService.i = i;
    }

    public void addCart(Cart adder) {
        //1) เพิ่มสินค้าลงในคลังสินค้า
        map_id.put(adder.getId(), adder);
        map_name.put(adder.getId(), adder.getP_name());
        Cart c = new Cart();
        System.out.print("\tAdd by " + adder.getId() + " : ");
        System.out.print(c.searchItemByProductId(adder.getId()));
        System.out.println("");
        i++;
    }

    public void removeCart(Cart remover) {
        //5) ลบสินค้าออกจากคลังสินค้า
        if (map_id.containsValue(remover)) {
            System.out.println("\tRemove : " + remover.getId());
            map_id.remove(remover.getId());
            map_name.remove(remover.getId());
            i--;
        } else {
            System.out.println("\tNo This Customer");
        }
    }

    public void clear() {
        map_id.clear();
        map_name.clear();
        i = 0;
    }

    public void listCart() {
        //3) แสดงข้อมูลของสินค้าทั้งหมด
        System.out.println("--------listCart --------");
        for (Iterator<Cart> it = map_id.values().iterator(); it.hasNext();) {
            Cart key = it.next();
            System.out.println("\t" + key);
        }
    }

    public String searchCartById(String id) {
        Cart c = new Cart();
        System.out.print("> Find : \n" );
        return "\t" + c.searchItemByProductId(id);
    }
}
