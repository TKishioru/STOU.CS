
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Cart {

    static HashMap<String, Product> i_cart = new HashMap<>();
    static HashMap<String, Integer> n_item = new HashMap<>();
    static HashMap<String, String> n_name = new HashMap<>();
    static HashMap<Integer, String> n_id = new HashMap<>();
    static int i = 0;
    Product P_id, P_name, P_price;
    Customer C_id, C_name;
    String id;
    int n;

    public Cart() {
    }

    public Cart(String id) {
        this.id = id;
        System.out.println("Welcome to Shop " + id);
    }

    public Cart(Product P_id, Product P_name, Product P_price, Customer C_id, Customer C_name, String id, int n) {
        this.P_id = P_id;
        this.P_name = P_name;
        this.P_price = P_price;
        this.C_id = C_id;
        this.C_name = C_name;
        this.id = id;
        this.n = n;
    }

    public String getId() {
        return id;
    }

    public Product getP_id() {
        return P_id;
    }

    public Product getP_name() {
        return P_name;
    }

    public Product getP_price() {
        return P_price;
    }

    public Customer getC_id() {
        return C_id;
    }

    public Customer getC_name() {
        return C_name;
    }

    public int getN() {
        return n;
    }

    public static int getI() {
        return i;
    }

    public static HashMap<String, Product> getI_cart() {
        return i_cart;
    }

    public static HashMap<String, Integer> getN_item() {
        return n_item;
    }

    public static HashMap<String, String> getN_name() {
        return n_name;
    }

    public static HashMap<Integer, String> getN_id() {
        return n_id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setP_id(Product P_id) {
        this.P_id = P_id;
    }

    public void setP_name(Product P_name) {
        this.P_name = P_name;
    }

    public void setP_price(Product P_price) {
        this.P_price = P_price;
    }

    public void setC_id(Customer C_id) {
        this.C_id = C_id;
    }

    public void setC_name(Customer C_name) {
        this.C_name = C_name;
    }

    public void setN(int n) {
        this.n = n;
    }

    public static void setN_item(HashMap<String, Integer> n_item) {
        Cart.n_item = n_item;
    }

    public static void setI_cart(HashMap<String, Product> map) {
        Cart.i_cart = i_cart;
    }

    public static void setN_name(HashMap<String, String> n_name) {
        Cart.n_name = n_name;
    }

    public static void setN_id(HashMap<Integer, String> n_id) {
        Cart.n_id = n_id;
    }

    public static void setI(int i) {
        Cart.i = i;
    }

    public void addItem(Product item, int n) {
        //1) เพิ่มสินค้าลงในคลังสินค้า
        //System.out.println(item);
        if (i_cart.containsKey(item.getName())) {
            n_item.replace(item.getName(), (n_item.get(item.getName()) + n));
        } else {
            i_cart.put(item.getName(), item);
            n_item.put(item.getName(), n);
            n_name.put(item.getName(), id);
            n_id.put(i, item.getName());
            i++;
        }
        System.out.println("\tAdd : " + item.getName());
    }

    public void removeItem(Product item) {
        if (i_cart.containsValue(item)) {
            i_cart.remove(item.getName());
            n_item.remove(item.getName());
            n_name.remove(item.getName());
            System.out.println("\tRemove : " + item + " by " + item.getName());
        } else {
            System.out.println("\tNo This Product");
        }
    }

    public void clear() {
        i_cart.clear();
        n_item.clear();
        n_name.clear();
        System.out.println(">Clear of " + id);
    }

    public String searchItemByProductName(String name) {
        if (i_cart.containsKey(name)) {
            return "Found This Product : " + i_cart.get(name);
        } else {
            return "Not Found This Product";
        }
    }

    public String searchItemByProductId(String id) {
        Set<String> x = n_name.keySet();
        if (n_name.containsValue(id)) {
            ProductService ps = new ProductService();
            x.forEach((value) -> {
                System.out.println(ps.searchProductincart(value));
            });
        }
        else{
            return "Don't have in this cart";
        }
        return "";
    }

    @Override
    public String toString() {
        return "Cart of " + id + " {" + n_name.keySet().toString() + '}';
    }
}
