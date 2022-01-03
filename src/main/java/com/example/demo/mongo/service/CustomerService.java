package com.example.demo.mongo.service;

import org.springframework.stereotype.Service;

import com.example.demo.mongo.model.Customer;

@Service
public interface CustomerService {

	public Customer getCustomer(String customerId);
	
}
