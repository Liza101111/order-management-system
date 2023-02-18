package com.springproject.ordermanagementsystem;

import com.springproject.ordermanagementsystem.entity.Customer;
import com.springproject.ordermanagementsystem.repository.CustomerRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class OrderManagementSystemApplicationTests {
	@Autowired
	private CustomerRepository customerRepository;

	@Test
	public void saveCustomerTest() {
		Customer customer = new Customer();
		customer.setId(1L);
		customer.setFullName("Xia Li");
		customer.setRegistrationCode("4505370");
		customer.setEmail("liza@gmail.com");
		customer.setTelephone("2387057097");

		Customer savedCustomer = customerRepository.save(customer);
		Assertions.assertThat(savedCustomer).isNotNull();
		Assertions.assertThat(savedCustomer.getId()).isGreaterThan(0);
	}

	@Test
	public void listAllCustomerTest() {
		Iterable<Customer> customers = customerRepository.findAll();

		Assertions.assertThat(customers).hasSizeGreaterThan(0);
		for(Customer customer: customers){
			System.out.println(customer);
		}

	}
	@Test
	public void deleteCustomerTest(){
		Long customerId = Long.valueOf(5);
		customerRepository.deleteById(customerId);

		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
		Assertions.assertThat(optionalCustomer).isNotPresent();
	}

}
