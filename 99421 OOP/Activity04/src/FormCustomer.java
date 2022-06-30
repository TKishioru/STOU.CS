import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FormCustomer extends JFrame {

	JTextField txtCusNum, txtCusName, txtCusAddr, txtCusPhone, txtCusMail, txtSearchCus;
	JLabel lCusNum, lCusName, lCusAddr, lCusPhone, lCusMail;
	JButton btnSaveCus, btnEditCus, btnDelCus;
	JTable tableCus;
	private DefaultTableModel modelCustomer;
	
	public FormCustomer() {
		
		String[] fonttxt = {"OptionPane.messageFont","OptionPane.messageFont","Label.font","Button.font","Table.font","TableHeader.font","TextField.font"};
		for(int i = 0 ;i < fonttxt.length; i ++) {
			UIManager.put(fonttxt[i], new Font("Tahoma", Font.PLAIN, 14));
		}

		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());

		JPanel pNorth = new JPanel();
		pNorth.setLayout(new GridLayout(1, 2, 5, 5));
		pNorth.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		c.add(pNorth, BorderLayout.NORTH);
		
		JPanel panelSearch = new JPanel();
		//panelSearch.setBorder(BorderFactory.createTitledBorder("ค้นหา"));
		JLabel txtfind = new JLabel("ค้นหา"); 
		txtSearchCus = new JTextField();
		txtSearchCus.setPreferredSize(new Dimension(150, 30));
		panelSearch.add(txtfind);
		panelSearch.add(txtSearchCus);
		pNorth.add(panelSearch); 

		JPanel panelButton = new JPanel();
		panelButton.setLayout(new GridLayout(1, 3, 30, 10));
		btnSaveCus = new JButton("เพิ่มข้อมูล");
		btnEditCus = new JButton("แก้ไข");
		btnDelCus = new JButton("ลบ");
		panelButton.add(btnSaveCus);
		panelButton.add(btnEditCus);
		panelButton.add(btnDelCus);
		panelButton.setBorder(BorderFactory.createEmptyBorder(30, 20, 20, 20));
		pNorth.add(panelButton);
		
		JPanel pWEST = new JPanel();
		pWEST.setLayout(new GridLayout(1, 2, 5, 5));
		pWEST.setBorder(BorderFactory.createEmptyBorder(5, 5, 20, 5));
		c.add(pWEST, BorderLayout.WEST);

		JPanel panelForm = new JPanel();
		panelForm.setLayout(new GridLayout(10, 1, 10, 5));
		lCusNum = new JLabel("เลขที่ลูกค้า (CUST_NUM)");
		txtCusNum = new JTextField();
		txtCusNum.setPreferredSize(new Dimension(150, 30));
		panelForm.add(lCusNum);
		panelForm.add(txtCusNum);

		lCusName = new JLabel("ชื่อลูกค้า (CUST_NAME)");
		txtCusName = new JTextField();
		txtCusName.setPreferredSize(new Dimension(150, 30));
		panelForm.add(lCusName);
		panelForm.add(txtCusName);

		lCusAddr = new JLabel("ที่อยู่ลูกค้า (CUST_ADDR)");
		txtCusAddr = new JTextField();
		txtCusAddr.setPreferredSize(new Dimension(150, 30));
		panelForm.add(lCusAddr);
		panelForm.add(txtCusAddr);

		lCusPhone = new JLabel("โทรศัพท์ลูกค้า (CUST_PHONE)");
		txtCusPhone = new JTextField();
		txtCusPhone.setPreferredSize(new Dimension(150, 30));
		panelForm.add(lCusPhone);
		panelForm.add(txtCusPhone);

		lCusMail = new JLabel("อีเมลลูกค้า (CUST_MAIL)");
		txtCusMail = new JTextField();
		txtCusMail.setPreferredSize(new Dimension(150, 30));
		panelForm.add(lCusMail);
		panelForm.add(txtCusMail);
		pWEST.add(panelForm);

		JPanel panelTable = new JPanel();
		panelTable.setBorder(BorderFactory.createEmptyBorder(15, 20, 5, 5));
		JScrollPane scrollTable = new JScrollPane();
		scrollTable.setPreferredSize(new Dimension(650, 300));

		tableCus = new JTable();
		Object data[][] = { { null, null, null, null, null }, 
				{ null, null, null, null, null },
				{ null, null, null, null, null }, };
		String col[] = { "เลขที่ลูกค้า", "ชื่อลูกค้า", "ที่อยู่ลูกค้า", "เบอร์โทรศัพท์", "อีเมล" };
		modelCustomer = new DefaultTableModel(data, col) {
			public boolean isCellEditable(int row, int columns) {
				return false;
			}
		};
		tableCus.setModel(modelCustomer);
		scrollTable.setViewportView(tableCus);
		panelTable.add(scrollTable);
		c.add(panelTable, BorderLayout.EAST);
	}
	
	public static void main(String[] args) {
		FormCustomer frame = new FormCustomer();
		frame.setSize(1000,600);
		frame.setTitle("การจัดการข้อมููลลูกค้า (CUSTOMER)");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
}
