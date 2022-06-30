/*
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class MainMenu extends JFrame implements ActionListener{
	
	JButton button = new JButton ( "ตกลง" );
	
	public MainMenu() {
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(30,0));
		
		String[] Title = {"บริษัท STOU-TEC จำกัด"," ","แบบฟอร์มใบสมัครพนักงาน"," ","ใบสมัครสำหรับงานด้าน ICT นี้ ให้ผู้สมัครกรอกรายละเอียดต่อไปนี้เพื่อที่"," ","บริษัท STOU-TEC จำกัด ทำการคัดเลือกตามความเหมาะสม"," "};
		for(int i = 0; i < Title.length; i++) {
			JLabel txt = new JLabel(Title[i],SwingConstants.CENTER);
			if(i == 0) {
				txt.setFont(new Font("TimeRoman",Font.ITALIC | Font.BOLD,24));
			}
			else {
				txt.setFont(new Font("TimeRoman",Font.ITALIC | Font.BOLD,12));
			}
			c.add(txt);
		}
		
		ArrayList<String> Question_list = new ArrayList<String>();
		Question_list.add("เลขประจำตัวของผู้สมัคร (AP_ID) :");
		Question_list.add("ชื่อ-นามสกุล (AP_NAME) :");
		Question_list.add("ที่อยู่ (AP_ADDRESS) :");
		Question_list.add("จังหวัด (AP_CHW) :");
		Question_list.add("เพศ (AP_SEX) :");
		Question_list.add("วุฒิการศึกษาขั้นสูงสุด (AP_ED) :");
		Question_list.add("(เช่น B.S.,B.A.,M.S.,M.BA.,M.A.)");
		Question_list.add(" ");
		Question_list.add("วิชาเอก (AP_MAJ)");
		Question_list.add("ความรู้ความสามารถหรือคุณสมบัติเฉพาะตำแหน่ง (QUAL_DESC)(ตอบได้ไม่เกิน 5 รายการ)");
		Question_list.add("ตำแหน่งที่ต้องการสมัคร (POS_NAME)(ตอบได้ไม่เกิน 3 ตำแหน่ง)");
		
		for(int i = 0; i < Question_list.size(); i++) {
			c.add(new JLabel(Question_list.get(i)));
			
			if(Question_list.get(i) == "เพศ (AP_SEX) :") {
				JRadioButton sex_M = new JRadioButton("ชาย");
				JLabel sex_N = new JLabel(" ");
				JRadioButton sex_F = new JRadioButton("หญิง");
				c.add(sex_M);
				c.add(sex_N);
				c.add(sex_F);
				
			}
			else if(Question_list.get(i) == "ความรู้ความสามารถหรือคุณสมบัติเฉพาะตำแหน่ง (QUAL_DESC)(ตอบได้ไม่เกิน 5 รายการ)") {
				String[] ABI = {"เลือกความรู้ความสามารถ","Web_ASP","C++","Database Administrator,DB2","Database Administrator,ORACLE","Graphic Design","JAVA","Management","Network","Secretarial work,45 words/min","Secretarial work,60 words/min","System Analyst, Level 1","System Analyst, Level 2","Visual Basic"};
				JComboBox[] Ability_list = new JComboBox[ABI.length];			
				
				for(int j = 0; j < 5; j++) {
					if(j == 0) {
						c.add(new JLabel(" "));
					}
					c.add(new JLabel("ความรู้ความสามารถ " + j));
					Ability_list[j] = new JComboBox(ABI);
					c.add(Ability_list[j]);
				}
				
			}
			else if(Question_list.get(i) == "ตำแหน่งที่ต้องการสมัคร (POS_NAME)(ตอบได้ไม่เกิน 3 ตำแหน่ง)") {
				String[] POS = {"เลือกตำแหน่งที่ต้องการสมัคร","Technical Programmer","Web Developer","General Manager","ICT Specialist","E-Business Analyst","ICT Documenter","Database Administrator","PC Administrator","Network Specialist","ICT Manage"};
				JComboBox[] Postwork_list = new JComboBox[POS.length];
				
				for(int j = 0; j < 3; j++) {
					if(j == 0) {
						c.add(new JLabel(" "));
					}
					c.add(new JLabel("ตำแหน่งที่ต้องการสมัคร " + j));
					Postwork_list[j] = new JComboBox(POS);
					c.add(Postwork_list[j]);
				}		
			}
			else if(Question_list.get(i) == "(เช่น B.S.,B.A.,M.S.,M.BA.,M.A.)" || Question_list.get(i) == " ") {
				continue;
			}
			else {
				c.add(new JTextField());
			}
		}
		
		button.setLocation ( 75, 25 );
		c.add(button);
		button.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
	    if (e.getSource() == button) {
	        System.out.println("OK");
	    }
	}

	public static void main(String[] args) {
		MainMenu frame = new MainMenu();
		frame.setSize(650,650);
		frame.setTitle("แบบฟอร์มใบสมัครพนักงาน");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
				
	}
}
*/
