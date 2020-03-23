package br.com.webservice.customeradmin.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.webservice.customeradmin.helper.Status;
import br.com.webservice.customeradmin.model.Customer;

@Component
public class CustomerDetailService {

	private static List<Customer> customers = new ArrayList<Customer>();
	
	static {
		Customer customer1 = new Customer(1, "Diego", "999999999", "sadfas@gmail.com");
		customers.add(customer1);
		Customer customer2 = new Customer(2, "marco", "999999999", "marco@gmail.com");
		customers.add(customer2);
		Customer customer3 = new Customer(3, "jose", "999999999", "jose@gmail.com");
		customers.add(customer3);
		Customer customer4 = new Customer(4, "maria", "999999999", "maria@gmail.com");
		customers.add(customer4);
	}
	
	public Customer findById(int id) {
	  Optional<Customer> customerOption = customers.stream().filter(c -> c.getId() == id).findAny();
		if(customerOption.isPresent()) {
			return customerOption.get();
		}
		return null;
	}
	
	public List<Customer> findAll(){
		return customers;
	}
	
	public Status deleteById(int id) {
		Optional<Customer> customerOption = customers.stream().filter(c -> c.getId() == id).findAny();
		if(customerOption.isPresent()) {
			customers.remove(customerOption.get());
			return Status.SUCCESS;
		}
		return Status.FAILURE;
	}
}
