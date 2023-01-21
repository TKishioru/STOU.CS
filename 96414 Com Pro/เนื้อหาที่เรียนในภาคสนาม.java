/*
public class test {
	//ตัวแปร global หมายถึงตัวแปรที่ใช้ได้ทุกค่าไม่ว่าจะอยู่ใน method อันไหน
	public static void main(String[] args){
		//วิธีสร้างตัวแปร (method main) : ชนิดตัวแปร ชื่อตัวแปร = ค่า;
		//ชนิดตัวแปร : int short long/float double/string/boolean
		int A;
		int B1 = 5;
		int B2 = 5 + 6;
		double C;
		double D = 56.6;
		double E = B1 + D;
		double F = 
				(double)B1/B2; //เป็นการเปลี่ยนจาก int to float
		
		//Output (print เขียนติดกัน/println เว้นบรรทัด)
		System.out.println("word 1");
		System.out.println("word 1" + "word 2");
		System.out.println("คำที่" + 1);
		System.out.println(41);
		System.out.println(16 + E);
		System.out.println("คำตอบของการหาร คือ " + String.format("%.2f", F)); //ปรับตำแหน่งทศนิยม
		
	
		//คณิตสาสตร์
		  1.int(ปัดเศษทิ้ง)
		
		
	}

}
*/


public class ex1 {
	public static void main(String[] args)
	{
		int x = 7;
		int y = 8;
		int A = x * y;
		double B;
		B = (double)x/y;
		System.out.print("(+) : ");
		System.out.println(x + y);
		System.out.print("(-) : ");
		System.out.println(x - y);
		System.out.print("(*) : ");
		System.out.println(A);
		System.out.print("(/) : ");
		System.out.println(B);
	}
}


import java.util.Scanner;
public class ex2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int Ans1 = x + y;
		int Ans2 = x - y;
		int Ans3 = x * y;
		double Ans4 = (double)x/y;
		
		System.out.println("(+) : " + Ans1);
		System.out.println("(-) : " + Ans2);
		System.out.println("(*) : " + Ans3);
		System.out.println("(/) : " + String.format("%.2f",Ans4));
	}
}



import java.util.Scanner;
public class ex3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		Calculation cal = new Calculation();
		int Ans1 = cal.add(x,y);
		int Ans2 = cal.subtract(x,y);
		int Ans3 = cal.multiply(x,y);
		double Ans4;
		System.out.println("(+) : " + Ans1);
		System.out.println("(-) : " + Ans2);
		System.out.println("(*) : " + Ans3);
		if(y != 0)
		{
			Ans4 = cal.divide(x,y);
			System.out.println("(/) : " + String.format("%.2f",Ans4));
		}
		else
		{
			System.out.println("ERROR");
		}
	}
}



import java.util.Scanner;
public class ex4 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum4 = 0;
		double def4 = 0;
		double SD4;
		int [] num4 = new int[20];
		//รับค่าแล้วนำมารวม
		for(int i = 0;i < 20;i++)
		{
			num4[i] = sc.nextInt();
			sum4 += num4[i];
		}
		double Mean4 = (double)sum4/num4.length;
		//คืดผลต่างแล้วยกกำลัง
		for(int i = 0;i < 20;i++)
		{
			def4 += Math.pow(num4[i] - Mean4,2);
		}
		SD4 = (double)Math.sqrt(def4/num4.length);

		System.out.println("Mean : " + Mean4);
		System.out.println("SD : " + String.format("%.2f",SD4));
	}
}

public class Calculation {
	public int add(int x,int y)
	{
		int Asum = x + y;
		return Asum;
	}
	public int subtract(int x,int y)
	{
		int Ssum = x - y;
		return Ssum;
	}
	public int multiply(int x,int y)
	{
		int Msum = x * y;
		return Msum;
	}
	public double divide(int x,int y)
	{
		double Dsum = (double)x / y;
		return Dsum;
	}
}




public class ex5 {
	public static void main(String[] args)
	{
		StatCal st = new StatCal();
		st.enter();
		st.getCount();
		st.getSum();
		System.out.println("Mean : " + st.getMean());
		System.out.println("SD : " + String.format("%.2f",st.getStdDeviation()));
	}
}

import java.util.Scanner;

public class StatCal {
	private int [] num5 = new int[20];
	private int sum5;
	private double Mean5,def5,SD5;
	Scanner sc = new Scanner(System.in);
	//รับค่า
	public void enter()
	{
		for(int i = 0;i < num5.length;i++)
			num5[i] = sc.nextInt();
	}
	//นับจำนวน
	public int getCount()
	{
		return num5.length;
	}
	//ผลรวม
	
	public int getSum()
	{
		sum5 = 0;
		for(int i = 0;i < num5.length;i++)
			sum5 += num5[i];
		return sum5;
	}
	//หาค่าเฉลี่ย
	public double getMean()
	{
		Mean5 = (double)sum5/num5.length;
		return Mean5;
	}
	//หาสูตร
	public double getStdDeviation()
	{
		def5 = 0;
		for(int i = 0;i < 20;i++)
		{
			def5 += Math.pow(num5[i] - Mean5,2);
		}
		SD5 = (double)Math.sqrt(def5/num5.length);
		return SD5;
	}
}

