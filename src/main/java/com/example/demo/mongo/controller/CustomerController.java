package com.example.demo.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mongo.model.Customer;
import com.example.demo.mongo.service.CustomerService;

@RestController
@RequestMapping("/")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("customer")
	public Customer getCustomer(@RequestHeader("customerId") String customerId) {
		return customerService.getCustomer(customerId);		
	}
	
}
