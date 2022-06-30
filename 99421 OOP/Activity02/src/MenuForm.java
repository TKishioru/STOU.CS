import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuForm extends JFrame implements ActionListener {
	
	JButton btncustomer, btninvoice, btnservice, btnemployee, btninv_serv;
	
	public MenuForm()
	{
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(5,1));
		
		JPanel pcustomer = new JPanel();
		btncustomer = new JButton ("ข้อมูลลูกค้า (Customer)");
		btncustomer.addActionListener(this);
		btncustomer.setFont(new Font("Tahoma" ,Font.PLAIN, 14)) ;
		pcustomer.add(btncustomer);
		c.add(pcustomer);
		
		JPanel pinvoice = new JPanel();
		btninvoice = new JButton ("ข้อมูลใบแจ้งหนี้ (Invoice)");
		btninvoice.setFont(new Font("Tahoma" ,Font.PLAIN, 14)) ;
		pinvoice.add(btninvoice);
		c.add(pinvoice);
		
		JPanel pservice = new JPanel();
		btnservice = new JButton ("ข้อมูลบริการ  (Service)");
		btnservice.setFont(new Font("Tahoma" ,Font.PLAIN, 14)) ;
		pservice.add(btnservice);
		c.add(pservice);
		
		JPanel pemployee = new JPanel();
		btnemployee = new JButton("ข้อมูลพนักงาน (Employee)");
		btnemployee.setFont(new Font("Tahoma" ,Font.PLAIN, 14)) ;
		pemployee.add(btnemployee);
		c.add(pemployee);
		
		JPanel pinv_serv = new JPanel();
		btninv_serv = new JButton("ข้อมูลใบแจ้งหนี้ระบุการบริการ(INV_SERV)");
		btninv_serv.setFont(new Font("Tahoma" ,Font.PLAIN, 14)) ;
		pinv_serv.add(btninv_serv);
		c.add(pinv_serv);}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// NOT NOW
		
	}
	


}
