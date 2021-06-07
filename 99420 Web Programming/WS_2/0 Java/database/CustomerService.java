package net.stou.database;

import java.util.HashMap;
public class CustomerService {
	HashMap<String, Customer> customers;
	public CustomerService() {
		super();
		customers = new HashMap<String, Customer>();
	}

	public HashMap<String, Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(HashMap<String, Customer> customers) {
		this.customers = customers;
	}

	public void addCustomer(Customer customer) {
		customers.put(customer.getProfilename(), customer);
	}

	public void removeCustomer(String key) {
		customers.remove(key);

	}

	public void updateCustomer(Customer customer) {
		String pf = customer.getProfilename();
		String fn = customer.getFirstname();
		String ln = customer.getLastname();
		Customer c = customers.get(pf);
		c.setFirstname(fn);
		c.setLastname(ln);
		c.setPhone(customer.getPhone());

	}

	public Customer searchByProfilename(String name) {
		return customers.get(name);
	}

    public void listCustomer() {
        /*System.out.println("--------listCustomer --------");
        for (Iterator<Customer> it = customers.values().iterator(); it.hasNext();) {
            Customer key = it.next();
            System.out.println("\t" + key);
        }*/
    }
}
