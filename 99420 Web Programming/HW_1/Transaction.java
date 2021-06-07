
public class Transaction {

    String customer_id, product_id;
    int product_amnt;
    String date;

    public Transaction() {
    }

    public Transaction(String customer_id, String product_id, int product_amnt, String date) {
        this.customer_id = customer_id;
        this.product_id = product_id;
        this.product_amnt = product_amnt; //จำนวนของที่ขายไป
        this.date = date;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public int getProduct_amnt() {
        return product_amnt;
    }

    public String getDate() {
        return date;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public void setProduct_amnt(int product_amnt) {
        this.product_amnt = product_amnt;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" + "customer_id=" + customer_id + ", product_id=" + product_id + ", date=" + date + '}';
    }

}
