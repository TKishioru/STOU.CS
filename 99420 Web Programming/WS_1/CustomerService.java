
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;

public class CustomerService extends Customer {

    static HashMap<String, Customer> map = new HashMap<>();
    static int i = 0;

    public CustomerService() {
    }

    public CustomerService(String id, String firstname, String lastname, String login, String password, LocalDate registerdate) {
        super(id, firstname, lastname, login, password, registerdate);
    }

    public static int getI() {
        return i;
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public LocalDate getRegisterdate() {
        return registerdate;
    }

    public static HashMap<String, Customer> getMap() {
        return map;
    }

    //4) เปลี่ยนแปลงข้อมูลของสมาชิก เช่น ชื่อลูกค้า, นามสกุลลูกค้า, ชื่อLogin, รหัสผ่าน
    public static void setMap(HashMap<String, Customer> map) {
        CustomerService.map = map;
    }

    public static void setI(int i) {
        CustomerService.i = i;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegisterdate(LocalDate registerdate) {
        this.registerdate = registerdate;
    }

    public void addCustomer(Customer adder) {
        //1) เพิ่มลูกค้า
        map.put(adder.getFirstname(), adder);
        System.out.println("\tAdd : " + adder.getFirstname());
        i++;
    }

    public void removeCustomer(Customer remover) {
        //5) ลบลูกค้า
        if (map.containsValue(remover)) {
            System.out.println("\tRemove : " + remover.getFirstname());
            map.remove(remover.getFirstname());
            i--;
        } else {
            System.out.println("\tNo This Customer");
        }
    }

    public void removeCustomer(String name) {
        //5) ลบลูกค้า
        if (map.containsKey(name)) {
            System.out.println("\tRemove : " + name);
            map.remove(name);
            i--;
        } else {
            System.out.println("\tNo This Customer");
        }
    }

    public void listCustomer() {
        System.out.println("--------listCustomer --------");
        for (Iterator<Customer> it = map.values().iterator(); it.hasNext();) {
            Customer key = it.next();
            System.out.println("\t" + key);
        }
    }

    public String searchCustomerByName(String name) {
        if (map.containsKey(name)) {
            return "Found This Customer : " + map.get(name);
        } else {
            return "Not Found This Customer";
        }
    }
}
