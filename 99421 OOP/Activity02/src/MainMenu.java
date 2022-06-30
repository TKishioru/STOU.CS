import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenu extends JFrame implements ActionListener {
	JButton btnmenureportform, btnmenuform, btnexit;

	public MainMenu()
	{
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(3,1));
		JLabel label1 = new JLabel("บริษัท STOU CARCARE จำกัด ", SwingConstants.CENTER);
		label1.setFont(new Font("Tahoma" ,Font.ITALIC |Font.BOLD, 25)) ;
		label1.setForeground(Color.blue);
		c.add(label1);  
		
		JPanel panel1 = new JPanel();
		btnmenuform = new JButton("ระบบจัดการข้อมูลพื้นฐาน");
		btnmenuform.addActionListener(this);
		btnmenureportform = new JButton("ระบบรายงาน");
		btnmenureportform.addActionListener(this);
		
		panel1.add(btnmenuform);
		panel1.add(btnmenureportform);
		
		c.add(panel1);
		
		
		JPanel panel2 = new JPanel();
		btnexit = new JButton("ออกจากระบบ");
		btnexit.addActionListener(this);
		panel2.add(btnexit);
		c.add(panel2);

	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == btnexit) 
		{
			System.exit(0);
		}
		else if(e.getSource() == btnmenureportform)
		{
			MenuReport menureport = new MenuReport();
			menureport.setSize(650,250);
			menureport.setTitle("การจัดการรายงาน: ธุรกิจดูแลรักษารถยนต์");
			menureport.setLocationRelativeTo(null);
			menureport.setVisible(true);
			
		}
		else if (e.getSource() == btnmenuform)
		{
			MenuForm menuform = new MenuForm();
			menuform.setSize(650,250);
			menuform.setTitle("ระบบจัดการพื้นฐาน: ธุรกิจรถยนต์");
			menuform.setLocationRelativeTo(null);
			menuform.setVisible(true);
		}
	}
	
	
	

	public static void main(String[] args) {
		MainMenu mainmenu = new MainMenu();
		mainmenu.setSize(650,250);
		mainmenu.setTitle("ธุรกิจดูแลรักษารถยนต์");
		mainmenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainmenu.setLocationRelativeTo(null);
		mainmenu.setVisible(true);
	}

}
