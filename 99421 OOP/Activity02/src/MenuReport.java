import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuReport extends JFrame implements ActionListener {
	
	JButton btncustomer_report, btnfinance_report, btnservice_report, btnexit_report; 
	
	public MenuReport()
	{
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(5,1));
		
		JPanel rcustomer = new JPanel();
		btncustomer_report = new JButton ("รายงานข้อมูลลูกค้า");
		btncustomer_report.setFont(new Font("Tahoma" ,Font.PLAIN, 14)) ;
		rcustomer.add(btncustomer_report);
		c.add(rcustomer);
		
		JPanel rfinance = new JPanel();
		btnfinance_report = new JButton ("รายงานข้อมูลการเงิน");
		btnfinance_report.setFont(new Font("Tahoma" ,Font.PLAIN, 14)) ;
		rfinance.add(btnfinance_report);
		c.add(rfinance);
		
		JPanel rservice = new JPanel();
		btnservice_report = new JButton ("รายงานข้อมูลการใช้บริการ");
		btnservice_report.setFont(new Font("Tahoma" ,Font.PLAIN, 14)) ;
		rservice.add(btnservice_report);
		c.add(rservice);
		
		JPanel rexit = new JPanel();
		btnexit_report = new JButton ("ออกจากระบบ");
		btnexit_report.addActionListener(this);
		btnexit_report.setFont(new Font("Tahoma" ,Font.PLAIN, 14)) ;
		rexit.add(btnexit_report);
		c.add(rexit);
	
			
	}

	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == btnexit_report) 
		{
			System.exit(0); 
		}
	}
	
}