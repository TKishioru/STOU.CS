
public class stou01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Shop s = new Shop();
        
        System.out.println("Welcome to S_6296002626_HW1");
        System.out.println();
        
        s.addProduct("P01","cake", 250, 10);
        s.addProduct("P02","cookie",50,30);
        s.addProduct("P01","cake", 250, 20);
        s.addCustomer("C01","TK");
        s.buy("cake", "TK", 2, "12/02/21");
        s.showTransaction();
	}

}
