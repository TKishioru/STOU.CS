package net.stou.s99420.model;

import java.util.HashMap;

public class Student {
	String id,name,login,password;
    public static HashMap<String, String> Student_id = new HashMap<String, String>();
    public static HashMap<String, String> Student_name = new HashMap<String, String>();
    public static HashMap<String, String> Student_login = new HashMap<String, String>();
    public static HashMap<String, String> Student_password = new HashMap<String, String>();

    public Student() {
    }

    public Student(String id, String name, String login, String password) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
    }
    
    static {
    	Student_id.put("001", "test");
        Student_name.put("admin", "test");
        Student_login.put("admin", "001");
        Student_password.put("admin", "1234");
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static HashMap<String, String> getStudent_name() {
        return Student_name;
    }

    public static void setStudent_name(HashMap<String, String> Student_name) {
        Student.Student_name = Student_name;
    }

    public static HashMap<String, String> getStudent_login() {
        return Student_login;
    }

    public static void setStudent_login(HashMap<String, String> Student_login) {
        Student.Student_login = Student_login;
    }

    public static HashMap<String, String> getStudent_password() {
        return Student_password;
    }

    public static void setStudent_password(HashMap<String, String> Student_password) {
        Student.Student_password = Student_password;
    }

    public static HashMap<String, String> getStudent_id() {
        return Student_id;
    }

    public static void setStudent_id(HashMap<String, String> Student_id) {
        Student.Student_id = Student_id;
    }
    
    public void registration(String id,String name,String login,String password){
    	System.out.println("  > registration");
    	Student_id.put(id, name);
        Student_name.put(login, name);
        Student_login.put(login, id);
        Student_password.put(login, password);
    }
    public boolean login(String login,String password){
    	System.out.println("  > login");
    	System.out.println("  > " + login +" : " + password);
    	System.out.println(Student_password.get(login));
        if(Student_password.containsKey(login)){
        	//Student_password.containsKey(login) && Student_password.get(login) == password 
        	System.out.println("Welcome " +  Student_name.get(login) + " to STOU Online School");
            return true;
        }
        else {
	        System.out.println("No student login name is in the system.");
	        return false;
        }
    }
    
    public void profile(String login){
    	System.out.println("  > profile");
        System.out.println(Student_login.get(login) + " " + Student_name.get(login));
        System.out.println(">> Subject");
        System.out.println("วิชา");
    }
    
    public boolean checkStudent(String id) {
    	System.out.println("  > checkStudent");
        if (Student_id.containsKey(id)) {
            System.out.println("pass");
            return true;
        } else {
            return false;
        }
    }
    public String show_name(String login) {
    	return Student_login.get(login) + " " + Student_name.get(login);
    }
}
