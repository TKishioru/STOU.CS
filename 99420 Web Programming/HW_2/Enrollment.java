package net.stou.s99420.model;

import java.time.LocalDate;
import java.util.HashMap;

public class Enrollment {
    String id_student, id_course;
    LocalDate date;
    int grade;
    public static HashMap<String, String> Enroll_Sname = new HashMap<String, String>();
    public static HashMap<String, Integer> Enroll_Cgrade = new HashMap<String, Integer>();
    public static HashMap<String, LocalDate> Enroll_date = new HashMap<String, LocalDate>();
    
    public Enrollment() {
    }

    public Enrollment(String id_student, String id_course, LocalDate date, int grade) {
        this.id_student = id_student;
        this.id_course = id_course;
        this.date = date;
        this.grade = grade;
    }

    public String getId_student() {
        return id_student;
    }

    public void setId_student(String id_student) {
        this.id_student = id_student;
    }

    public String getId_course() {
        return id_course;
    }

    public void setId_course(String id_course) {
        this.id_course = id_course;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static HashMap<String, String> getEnroll_Sname() {
        return Enroll_Sname;
    }

    public static void setEnroll_Sname(HashMap<String, String> Enroll_Sname) {
        Enrollment.Enroll_Sname = Enroll_Sname;
    }

    public static HashMap<String, Integer> getEnroll_Cgrade() {
        return Enroll_Cgrade;
    }

    public static void setEnroll_Cgrade(HashMap<String, Integer> Enroll_Cgrade) {
        Enrollment.Enroll_Cgrade = Enroll_Cgrade;
    }

    public static HashMap<String, LocalDate> getEnroll_date() {
        return Enroll_date;
    }

    public static void setEnroll_date(HashMap<String, LocalDate> Enroll_date) {
        Enrollment.Enroll_date = Enroll_date;
    }

    public void enrollment(String id_student,String id_course){
    	System.out.println(" > enrollment");
        Student s = new Student();
        Course c = new Course();
        if(s.checkStudent(id_student)&& c.checkCourse(id_course)){
		   Enroll_Cgrade.put(id_course, grade);
		   Enroll_Sname.put(id_course, id_student);
		   Enroll_date.put(id_course, LocalDate.now());
        }
        else{
            System.out.println("Can not register Due to the wrong information entered.");
        }
    }
    public void profile(String login){
    	System.out.println("  > profile");
    	Student s = new Student();
    	Course c = new Course();
        System.out.println(s.show_name(login));
        System.out.println(">> Subject");
        System.out.println(c.searchCourse(login));
    }
    
    public String Show_enroll(String id_c) {
    	return id_c + " " + Enroll_Sname.get(id_c);
    }
}
