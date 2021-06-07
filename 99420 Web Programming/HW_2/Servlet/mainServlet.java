package net.stou.s99422.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.stou.s99420.model.Course;
import net.stou.s99420.model.Enrollment;
import net.stou.s99420.model.Student;

/**
 * Servlet implementation class mainServlet
 */
@WebServlet("/")
public class mainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void G_signin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("Check_signin");
    	String getid = request.getParameter("S_id");
    	String getname = request.getParameter("S_name");
    	String getloginname = request.getParameter("S_loginname");
    	String getpassword = request.getParameter("S_password");
    	
    	Student s = new Student();
    	s.registration(getid,getname,getloginname, getpassword);
    	request.getRequestDispatcher("index.jsp").forward(request, response);
    }
    
    public int c = 0;
    public String user = "";
    protected void G_login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("Check_login");
    	String getloginname = request.getParameter("S_login");
    	String getpassword = request.getParameter("S_password");
    	
    	Student s = new Student();
    	/*if(s.login(getloginname, getpassword)){
    		request.getRequestDispatcher("index.jsp").forward(request, response);
    		user = getloginname;
    		c = 1;
    	}*/
    	s.setLogin(getloginname);
    	s.setPassword(getpassword);
    	request.setAttribute("getloginname",s);
    	user = getloginname;
		c = 1;
    }
    protected void G_profile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	if(c==1) {
	    	System.out.println("Check_profile");
	    	Student s = new Student();
	    	//s.profile(user);
    	}
    	else {
    		System.out.println("Not Data");
    	}
    }
    protected void G_search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    if(c==1) {
	    	System.out.println("Check_search");
	    	String getname = request.getParameter("C_name");
	    	Course c = new Course();
	    	if(c.searchCourse(getname)) {
	    		//request.getRequestDispatcher("stou_enroll.jsp").forward(request, response);
	    	}
	    }
		else {
			System.out.println("Not Data");
		}
    }
    protected void G_enroll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	if(c==1) {
	    	System.out.println("Check_enroll");
	    	String id_student = request.getParameter("S_id");
	    	String id_course = request.getParameter("C_id");
	    	
	    	Enrollment e = new Enrollment();
	    	e.enrollment(id_student, id_course);
    	}
    	else {
    		System.out.println("Not Data");
    	}
    }
    protected void G_logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("Check_logout");
    	c = 0;
    	user = "";
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getServletPath();
		switch (action) {
			case "/signin" :
				G_signin(request,response);
				break;
			case "/login" :
				G_login(request,response);
				break;
			case "/profile" :
				G_profile(request,response);
				break;
			case "/search" :
				G_search(request,response);
				break;
			case "/enroll" :
				G_enroll(request,response);
				break;
			case "/logout" :
				G_login(request,response);
				break;
			default:
				System.out.println("ERROR");
				break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
