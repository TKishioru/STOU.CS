package net.stou.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.stou.database.Customer;
import net.stou.database.CustomerService;

@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String INSERT_OR_EDIT = "/NewCustomer.jsp";
	private static String LIST_PRODUCT = "/listCustomer.jsp";
	private CustomerService customerservice;

	public CustomerController() {
		super();
		customerservice = new CustomerService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String forward = "";
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("add")) {
			Customer customer = new Customer(request.getParameter("profilename"), request.getParameter("firstname"),
					request.getParameter("lastname"), request.getParameter("phone"));
			customerservice.addCustomer(customer);

			HashMap<String, Customer> listCustomer = customerservice.getCustomers();
			request.setAttribute("customerservice", listCustomer);
			forward = LIST_PRODUCT;
		} else if (action.equalsIgnoreCase("delete")) {
			String profilename = request.getParameter("profilename");
			customerservice.removeCustomer(profilename);

			HashMap<String, Customer> listCustomer = customerservice.getCustomers();
			request.setAttribute("customerservice", listCustomer);
			forward = LIST_PRODUCT;
		} else if (action.equalsIgnoreCase("edit")) {
			forward = INSERT_OR_EDIT;
			String profilename = request.getParameter("profilename");
			Customer customer = customerservice.searchByProfilename(profilename);
			request.setAttribute("customer", customer);
		} else if (action.equalsIgnoreCase("listCustomer")) {

			HashMap<String, Customer> listCustomer = customerservice.getCustomers();
			request.setAttribute("customerservice", listCustomer);
			forward = LIST_PRODUCT;
		} else {
			forward = INSERT_OR_EDIT;

		}
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);

	}

}
