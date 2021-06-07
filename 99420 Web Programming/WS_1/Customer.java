
import java.time.LocalDate;

public class Customer {

    String id, firstname, lastname, login, password, name;
    LocalDate registerdate;

    public Customer() {
    }

    public Customer(String id, String firstname, String lastname, String login, String password, LocalDate registerdate) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.login = login;
        this.password = password;
        this.registerdate = registerdate;
        this.name = firstname + " " + lastname;
        System.out.println("Welcome, " + id + " " + name);
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

    public LocalDate getRegisterdate() {
        return registerdate;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        System.out.println("> SetId");
        this.id = id;
    }

    public void setFirstname(String firstname) {
        System.out.println("> SetFirstname");
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        System.out.println("> SetLastname");
        this.lastname = lastname;
    }

    public void setLogin(String login) {
        System.out.println("> SetLogin");
        this.login = login;
    }

    public void setPassword(String password) {
        System.out.println("> SetPassword");
        this.password = password;
    }

    public void setRegisterdate(LocalDate registerdate) {
        System.out.println("> SetRegisterdate");
        this.registerdate = registerdate;
    }

    public void setName(String name) {
        System.out.println("> SetName");
        this.name = name;
    }

    public String toString() {
        return "Customer [id=" + id + ", name=" + name + "]";
    }
}
