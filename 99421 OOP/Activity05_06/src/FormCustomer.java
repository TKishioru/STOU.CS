import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FormCustomer extends JFrame {

	JTextField txtCusNum, txtCusName, txtCusAddr, txtCusPhone, txtCusMail, txtSearchCus;
	JLabel lCusNum, lCusName, lCusAddr, lCusPhone, lCusMail;
	JButton btnSaveCus, btnEditCus, btnDelCus;
	JTable tableCus;
	private DefaultTableModel modelCustomer;
	
	Connection conn = MyConnect.getConnection();
	
	public FormCustomer() {
		
		String[] fonttxt = {"OptionPane.messageFont","OptionPane.messageFont","Label.font","Button.font","Table.font","TableHeader.font","TextField.font"};
		for(int i = 0 ;i < fonttxt.length; i ++) {
			UIManager.put(fonttxt[i], new Font("Tahoma", Font.PLAIN, 14));
		}
/*
		UIManager.put("OptionPane.messageFont", new Font("Tahoma", Font.PLAIN, 14));
		UIManager.put("OptionPane.messageFont", new Font("Tahoma", Font.PLAIN, 14));
		UIManager.put("Label.font", new Font("Tahoma", Font.PLAIN, 14));
		UIManager.put("Button.font", new Font("Tahoma", Font.PLAIN, 14));
		UIManager.put("Table.font", new Font("Tahoma", Font.PLAIN, 14));
		UIManager.put("TableHeader.font", new Font("Tahoma", Font.PLAIN, 14));
		UIManager.put("TextField.font", new Font("Tahoma", Font.PLAIN, 14));
*/
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
		txtSearchCus.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent keyevent) {
				showData();
			}
		});
		//panelSearch.add(txtfind);
		panelSearch.add(txtSearchCus);
		pNorth.add(panelSearch); 

		JPanel panelButton = new JPanel();
		panelButton.setLayout(new GridLayout(1, 3, 30, 10));
		
		btnSaveCus = new JButton("เพิ่มข้อมูล");
		btnSaveCus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insert();
			}
		});
		btnEditCus = new JButton("แก้ไข");
		btnEditCus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update();
			}
		});
		btnDelCus = new JButton("ลบ");
		btnDelCus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete();
			}
		});
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
		tableCus.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) {
				int index = tableCus.getSelectedRow();
				txtCusNum.setText(tableCus.getValueAt(index, 0).toString());
				txtCusName.setText(tableCus.getValueAt(index, 0).toString());
				txtCusAddr.setText(tableCus.getValueAt(index, 0).toString());
				txtCusPhone.setText(tableCus.getValueAt(index, 0).toString());
				txtCusMail.setText(tableCus.getValueAt(index, 0).toString());
			}
		});
		scrollTable.setViewportView(tableCus);
		panelTable.add(scrollTable);
		c.add(panelTable, BorderLayout.EAST);
		
		modelCustomer = (DefaultTableModel)tableCus.getModel();
		
		showData();
		
	}
		public void showData() {
			try {
				int totalRow = tableCus.getRowCount() -1;
				while(totalRow > -1) {
					modelCustomer.removeRow(totalRow);
					totalRow--;
				}
			String search = txtSearchCus.getText().trim();
			String sql = "SELECT * FROM Customer"
					+ "WHERE CUST_NUM LIKE '%" + search + "%'"
					+ "OR CUST_NAME LIKE '%" + search + "%'"
					+ "OR CUST_ADDR LIKE '%" + search + "%'"
					+ "OR CUST_PHONE LIKE '%" + search + "%'"
					+ "OR CUST_MAIL LIKE '%" + search + "%'";
			ResultSet rs = conn.createStatement().executeQuery(sql);
			int row = 0;
			while(rs.next()) {
				modelCustomer.addRow(new Object[0]);
				modelCustomer.setValueAt(rs.getString("CUST_NUM"),row,0);
				modelCustomer.setValueAt(rs.getString("CUST_NAME"),row,1);
				modelCustomer.setValueAt(rs.getString("CUST_ADDR"),row,2);
				modelCustomer.setValueAt(rs.getString("CUST_PHONE"),row,3);
				modelCustomer.setValueAt(rs.getString("CUST_MAIL"),row,4);
				
				row++;
				
			}
			tableCus.setModel(modelCustomer);
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

		public void insert() {
			try {
				String sql = "INSERT INTO CUSTOMER VALUES (?,?,?,?,?)";
				PreparedStatement pre = conn.prepareStatement(sql);
				pre.setString(1, txtCusNum.getText().trim());
				pre.setString(2, txtCusName.getText().trim());
				pre.setString(3, txtCusAddr.getText().trim());
				pre.setString(4, txtCusPhone.getText().trim());
				pre.setString(5, txtCusMail.getText().trim());
				
				if(pre.executeUpdate() != -1) {
					JOptionPane.showMessageDialog(this, "บันทึกข้อมูลลูกค้าเรียบร้อยแล้ว","ผลการบันทึกรายการ", JOptionPane.INFORMATION_MESSAGE);
					showData();
					txtCusNum.setText("");
					txtCusName.setText("");
					txtCusAddr.setText("");
					txtCusPhone.setText("");
					txtCusMail.setText("");
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

		public void update() {
			try{	
				if(tableCus.getSelectedRow() == -1) {
					return;
				}
				String sql = "UPDATE CUSTOMER SET"
						+ " CUST_NAME=? "
						+ " CUST_ADDR=? "
						+ " CUST_PHONE=? "
						+ " CUST_MAIL=? "
						+ " WHERE CUST_NUM=? ";
				
				PreparedStatement pre = conn.prepareStatement(sql);
				pre.setString(1, txtCusName.getText().trim());
				pre.setString(2, txtCusAddr.getText().trim());
				pre.setString(3, txtCusPhone.getText().trim());
				pre.setString(4, txtCusMail.getText().trim());
				pre.setString(5, txtCusNum.getText().trim());
				
				if(pre.executeUpdate() != -1) {
					JOptionPane.showMessageDialog(this, "แก้ไขรายการแล้ว","ผลการบันทึกรายการ", JOptionPane.INFORMATION_MESSAGE);
					showData();
					txtCusNum.setEditable(true);
					txtCusNum.setText("");
					txtCusName.setText("");
					txtCusAddr.setText("");
					txtCusPhone.setText("");
					txtCusMail.setText("");
			}
			}
			catch(SQLException ex) {
				ex.printStackTrace();
			}
		}
		
		public void delete() {
				try{	
					if(tableCus.getSelectedRow() == -1) {
						return;
					}
					String sql = "DELETE FROM CUSTOMER"
							+ " WHERE CUST_NUM=? ";
					
					PreparedStatement pre = conn.prepareStatement(sql);
					pre.setString(1, txtCusName.getText().trim());
					pre.setString(2, txtCusAddr.getText().trim());
					pre.setString(3, txtCusPhone.getText().trim());
					pre.setString(4, txtCusMail.getText().trim());
					pre.setString(5, txtCusNum.getText().trim());
					
					if(pre.executeUpdate() != -1) {
						JOptionPane.showMessageDialog(this, "ลบรายการแล้ว","ผลการลบรายการ", JOptionPane.INFORMATION_MESSAGE);
						showData();
						txtCusNum.setEditable(true);
						txtCusNum.setText("");
						txtCusName.setText("");
						txtCusAddr.setText("");
						txtCusPhone.setText("");
						txtCusMail.setText("");
				}
				}
				catch(SQLException ex) {
					ex.printStackTrace();
				}
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
