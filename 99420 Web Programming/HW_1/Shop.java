
import java.util.ArrayList;

public class Shop {

    String shopname;
    Product products[];
    Customer customers[];
    static ArrayList<String> C_name = new ArrayList<String>();
    static ArrayList<String> P_name = new ArrayList<String>();
    static ArrayList<Integer> P_amnt = new ArrayList<Integer>();
    static ArrayList<String> A_date = new ArrayList<String>();

    public Shop() {
    }

    public Shop(String shopname) {
        this.shopname = shopname;
    }

    public String getShopname() {
        return shopname;
    }

    public Product[] getProducts() {
        return products;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public static ArrayList<String> getC_name() {
        return C_name;
    }

    public static ArrayList<String> getP_name() {
        return P_name;
    }

    public static ArrayList<Integer> getP_amnt() {
        return P_amnt;
    }

    public static ArrayList<String> getA_date() {
        return A_date;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public static void setC_name(ArrayList<String> C_name) {
        Shop.C_name = C_name;
    }

    public static void setP_name(ArrayList<String> P_name) {
        Shop.P_name = P_name;
    }

    public static void setP_amnt(ArrayList<Integer> P_amnt) {
        Shop.P_amnt = P_amnt;
    }

    public static void setA_date(ArrayList<String> A_date) {
        Shop.A_date = A_date;
    }

    public void addProduct(String product_id, String product_name, int product_price, int product_amnt) {
        System.out.println("---- TO...addProduct ----");
        Product pd = new Product();
        if (pd.check_stock(product_id, product_name, product_price, product_amnt) != 1) {
            Product p_new = new Product(product_id, product_name, product_price, product_amnt);
            System.out.println(p_new.toString());
        }
        System.out.println();
    }

    public void addCustomer(String customer_id, String customer_name) {
        System.out.println("---- TO...addCustomer ----");
        Customer ct = new Customer();
        if (ct.check_customer(customer_id, customer_name) != 1) {
            Customer c_new = new Customer(customer_id, customer_name);
            System.out.println(c_new.toString());
        }
        System.out.println();
    }

    public void buy(String product_name, String customer_name, int amnt, String date) {
        Product pd = new Product();
        if (pd.check_stock(product_name, amnt) == 1) {
            System.out.println("You can buy");
            C_name.add(customer_name);
            P_name.add(product_name);
            P_amnt.add(amnt);
            A_date.add(date);
        } else {
            System.out.println("You can not buy");
        }
    }

    public void showTransaction() {
        System.out.println("---- TO...showTransaction ----");
        for (int i = 0; i < C_name.size(); i++) {
            Transaction tr = new Transaction(C_name.get(i), P_name.get(i), P_amnt.get(i), A_date.get(i));
            System.out.println(tr.toString());
        }
    }

}
