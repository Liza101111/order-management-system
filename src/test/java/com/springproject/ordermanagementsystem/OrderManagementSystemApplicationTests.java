package com.springproject.ordermanagementsystem;

import com.springproject.ordermanagementsystem.entity.Customer;
import com.springproject.ordermanagementsystem.repository.CustomerRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

}
