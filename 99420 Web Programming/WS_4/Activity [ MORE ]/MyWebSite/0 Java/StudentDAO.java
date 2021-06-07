package net.stou.ws;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	
	private static StudentDAO instance;
	private static List<Student> data = new ArrayList<>();
	
	static {
		data.add(new Student(1,"6296000240", "Apidet", "Ranong"));
		data.add(new Student(2, "6296002626", "Khampeerada", "Ayuthaya"));
	}
	
	private StudentDAO() {}
	public static StudentDAO getInstance() {
		if(instance == null) {
			instance = new StudentDAO();
		}
		
		return instance;
	}
	
	public List<Student> listALL() {
		return new ArrayList<Student>(data);
	}
		
	public int add(Student student) {
		int newId = data.size()+1;
		student.setId(newId);
		data.add(student);
		return newId;
	}
	
	public Student get(int id) {
		Student studentToFind = new Student(id);
		int index = data.indexOf(studentToFind);
		if(index >= 0) {
			return data.get(index);
		}
			return null;
	}
	
	public boolean update(Student student) {
		int index = data.indexOf(student);
		if(index >= 0) {
			data.set(index, student);
			return true;
		}
			return false;
	}

	public boolean delete(int id) {
		Student studentToFind = new Student(id);
		int index = data.indexOf(studentToFind);
		if(index >= 0) {
			data.remove(index);
			return true;
		}
			return false;
	}
}
