
import java.util.HashMap;

public class Customer {

    String customer_id;
    String customer_name;
    public static HashMap<String, String> item = new HashMap<String, String>();

    public Customer() {
    }

    public Customer(String customer_id, String customer_name) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        item.put(customer_id, customer_name);
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public static HashMap<String, String> getItem() {
        return item;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public static void setItem(HashMap<String, String> item) {
        Customer.item = item;
    }

    public int check_customer(String customer_id, String customer_name) {
        if (item.containsKey(customer_id)) {
            System.out.println("This Customer have bought");
            return 1;
        } else {
            System.out.println("This Customer have not bought");
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Customer{" + "customer_id=" + customer_id + ", customer_name=" + customer_name + ", item=" + item + '}';
    }

}
