import java.time.LocalDate;

public class stou11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
        //3.1
        Customer c1 = new Customer("C001", "Urai", "sudjai", "urai", "urai", LocalDate.now());
        Customer c2 = new Customer("C002", "Paitoon", "sukjai", "paitoon", "paitoon", LocalDate.now());
        CustomerService cs = new CustomerService();
        cs.addCustomer(c1);
        cs.addCustomer(c2);
        cs.listCustomer();
        System.out.println(cs.searchCustomerByName("Urai"));
        c1.setPassword("uraisudjai");
        cs.removeCustomer(c2);
        cs.removeCustomer("Urai");
        cs.listCustomer();

        //3.2
        Product p1 = new Product("P01", "Xiaomi", "Amazfit GTS Gold", 3900, "p01.jpg");
        Product p2 = new Product("P02", "Fitbit", "Versa 2 Petal Copper", 6000, "p02.jpg");
        Product p3 = new Product("P03", "Suunto", "White Bergundy", 13000, "p03.jpg");
        Product p4 = new Product("P04", "Garmin", "Vivifit 4 Activity Tracker Black L", 3300, "p04.jpg");
        ProductService ps = new ProductService();       //change name : cs ----> ps
        ps.addProduct(p1);
        ps.addProduct(p2);
        ps.addProduct(p3);
        ps.addProduct(p4);
        ps.listProduct();
        p1.setPrice(4200);
        ps.removeProduct(p2);
        ps.listProduct();
        System.out.println(ps.searchProductByName("Garmin"));
	 */
    
        //3.3
        Product p1 = new Product("P01","Xiaomi","Amazfit GTS Gold",3900,"p01.jpg");
        Product p2 = new Product("P02","Fitbit","Versa 2 Petal Copper",6000,"p02.jpg");
        Product p3 = new Product("P03","Suunto","White Bergundy",13000,"p03.jpg");
        ProductService ps = new ProductService();
        ps.addProduct(p1);
        ps.addProduct(p2);
        ps.addProduct(p3);
        ps.listProduct();
        
        Customer c1 = new Customer("C001","Urai","sudjai","urai","urai",LocalDate.now());
        Customer c2 = new Customer("C002","Paitoon","sukjai","paitoon","paitoon",LocalDate.now());
        CustomerService cs = new CustomerService();
        cs.addCustomer(c1);
        cs.addCustomer(c2);
        cs.listCustomer();
        
        //**** ต้องลบตะกร้าที่ 1 ออกก่อนมีตะกร้าที่ 2
        Cart cart1 = new Cart(c1.getId());
        cart1.addItem(p1, 50);
        cart1.addItem(p2, 10);
        cart1.addItem(p3, 30);
        cart1.removeItem(p1);
        System.out.println(cart1.searchItemByProductName("Suunto"));
        cart1.clear();                //comment
        Cart cart2 = new Cart(c2.getId());
        cart2.addItem(p1, 50);
        cart2.addItem(p2, 10);
        CartService cts = new CartService();
        cts.addCart(cart1);
        cts.addCart(cart2);
        cts.removeCart(cart1);          //comment
        cts.listCart();
        System.out.println(cts.searchCartById(c2.getId()));

	}

}
