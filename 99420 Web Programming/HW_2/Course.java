package net.stou.s99420.model;

import java.util.HashMap;

public class Course {
    String id, name;
    int unit;
    public static HashMap<String, String> Course_id = new HashMap<String, String>();
    public static HashMap<String, String> Course_name = new HashMap<String, String>();
    public static HashMap<String, Integer> Course_unit = new HashMap<String, Integer>();

    public Course() {
    }

    public Course(String id, String name, int unit) {
        this.id = id;
        this.name = name;
        this.unit = unit;
    }
    
	static {
	    //วิชาในวิทยาการคอมพิวเตอร์
	    Course_name.put("10", "A");
	    Course_name.put("10103", "ทักษะชีวิต");
	    Course_name.put("10111", "ภาษาอังกฤษเพื่อการสื่อสาร");
	    Course_name.put("10131", "สังคมมนุษย์");
	    Course_name.put("10141", "วิทยาศาสตร์ เทคโนโลยีและสิ่งแวดล้อมเพื่อชีวิต");
	    Course_name.put("10151", "ไทยศึกษา");
	    
	    Course_id.put("96101", "คอมพิวเตอร์เบื้องต้น");
	    Course_id.put("96102", "คณิตศาสตร์และสถิติสำหรับวิทยาศาสตร์และเทคโนโลยี");
	    Course_id.put("99201", "วิทยาศาสตร์สำหรับเทคโนโลยีสารสนเทศและการสื่อสาร");
	    Course_id.put("99402", "การจัดการความมั่นคงปลอดภัยในระบบคอมพิวเตอร์");
	    
	    Course_id.put("96304", "การสื่อสารข้อมูลและระบบเครือข่ายคอมพิวเตอร์");
	    Course_id.put("96408", "การจัดการระบบฐานข้อมูล");
	    Course_id.put("96414", "การโปรแกรมคอมพิวเตอร์");
	    Course_id.put("99312", "คณิตศาสตร์สำหรับเทคโนโลยีสารสนเทศและการสื่อสาร");
	    Course_id.put("99313", "การสื่อสารไร้สายและเครือข่าย");
	    Course_id.put("99314", "โครงสร้างข้อมูลและขั้นตอนวิธี");
	    Course_id.put("99315", "สถาปัตยกรรมคอมพิวเตอร์และระบบปฏิบัติการ");
	    Course_id.put("99316", "การวิเคราะห์และออกแบบระบบเชิงวัตถุ");
	    Course_id.put("99319", "การออกแบบส่วนปฏิสัมพันธ์บนเว็บและโมบาย");
	    Course_id.put("99410", "การจัดการและการออกแบบระบบโทรคมนาคม");
	    Course_id.put("99414", "เทคโนโลยีมัลติมีเดีย");
	    Course_id.put("99415", "วิศวกรรมซอฟต์แวร์");
	    Course_id.put("99419", "ความมั่นคงปลอดภัยไซเบอร์");
	    Course_id.put("99420", "การโปรแกรมเว็บ");
	    Course_id.put("99421", "การโปรแกรมเชิงวัตถุ");
	    Course_id.put("99422", "การโปรแกรมประยุกต์บนอุปกรณ์เคลื่อนที่");
	    Course_id.put("99429", "ประสบการณ์วิชาชีพวิทยาการคอมพิวเตอร์");
	}
	
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public static HashMap<String, String> getCourse_name() {
        return Course_name;
    }

    public static void setCourse_name(HashMap<String, String> Course_name) {
        Course.Course_name = Course_name;
    }

    public static HashMap<String, Integer> getCourse_unit() {
        return Course_unit;
    }

    public static void setCourse_unit(HashMap<String, Integer> Course_unit) {
        Course.Course_unit = Course_unit;
    }

    public static HashMap<String, String> getCourse_id() {
        return Course_id;
    }

    public static void setCourse_id(HashMap<String, String> Course_id) {
        Course.Course_id = Course_id;
    }

    public void addCourse(String id,String name,int unit) {
    	System.out.println(" > addCourse");
        Course_id.put(id, name);
        Course_name.put(name, id);
        Course_unit.put(id, unit);
    }

    public boolean searchCourse(String name) {
    	System.out.println(" > searchCourse");
        if (Course_name.containsKey(name)) {
            System.out.println(Course_name.get(name) + " " + name + " " + Course_unit.get(Course_name.get(name)));
            return true;
        } else {
            System.out.println("Can't find this listing.");
            return false;
        }
    }
    
    public String show_course(String C_id) {
    	String s = "";
    	s = C_id + " " + Course_id.get(C_id);
    	/*Set<String> x = n_name.keySet();
    	if (n_name.containsValue(id)) {
            ProductService ps = new ProductService();
            x.forEach((value) -> {
                System.out.println(ps.searchProductincart(value)); //+ i_cart.get(n_name.get(id)
            });
        }
        else{
            return "Don't have in this cart";
        }*/
        return s;
    }

    public boolean checkCourse(String name) {
    	System.out.println(" > checkCourse");
        System.out.println(name);
        if (Course_name.containsKey(name)) {
            System.out.println("pass");
            return true;
        } else {
            return false;
        }
    }

}
