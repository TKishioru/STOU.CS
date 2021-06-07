
import java.util.HashMap;

public class Product {

    String product_id, product_name;
    int product_price, product_stockamnt;
    public static HashMap<String, Integer> item = new HashMap<String, Integer>();

    public Product() {

    }

    public Product(String product_id, String product_name, int product_price, int product_stockamnt) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_stockamnt = product_stockamnt; //จำนวนคงเหลือในโกดัง
        item.put(product_name, product_stockamnt);
    }

    public String getProduct_id() {
        return product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public int getProduct_price() {
        return product_price;
    }

    public int getProduct_stockamnt() {
        return product_stockamnt;
    }

    public static HashMap<String, Integer> getItem() {
        return item;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public void setProduct_stockamnt(int product_stockamnt) {
        this.product_stockamnt = product_stockamnt;
    }

    public static void setItem(HashMap<String, Integer> item) {
        Product.item = item;
    }

    public int check_stock(String product_id, String product_name, int product_price, int product_amnt) {
        if (item.containsKey(product_name)) {
            System.out.println("Shop have");
            item.replace(product_name, (item.get(product_name) + product_amnt));
            return 1;
        } else {
            return 0;
        }
    }

    public int check_stock(String product_name, int amnt) {
        if (item.containsKey(product_name) && (amnt <= item.get(product_name))) {
            item.replace(product_name, (item.get(product_name) - amnt));
            System.out.println("Now, This product have " + (item.get(product_name)));
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", product_name=" + product_name + ", product_price=" + product_price + ", product_stockamnt=" + product_stockamnt + ", item=" + item + '}';
    }

}
