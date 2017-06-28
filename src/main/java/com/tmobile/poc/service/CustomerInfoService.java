package com.tmobile.poc.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import org.springframework.stereotype.Service;


import com.tmobile.poc.repository.CustomerDAORepository;
import com.tmobile.poc.vo.CustomerVO;



@Service
public class CustomerInfoService {
	@Autowired
	private CustomerDAORepository repository;

	@Autowired
	private MongoTemplate template;
	@Qualifier
	private Query query;
	@Qualifier
	private Update update;
	@Autowired
	private CustomerVO customer;


	public CustomerVO getCustomerInfoByPhoneNumber(String phoneNumber) {

		return repository.findCustomerByPhoneNumber(phoneNumber);
	}

	public CustomerVO saveCustomerInfo(CustomerVO customer) {
		if (customer != null) {
			customer.setCustomerId(customer.getCustomerId());
			try{
				customer=repository.insert(customer);
			}catch (Exception e) {
				System.out.println("msg in catch"+e.getMessage());
			}

		}
		return customer;

	}

	public CustomerVO updateCustomerInfo(CustomerVO customer) {
		try{
			
			template.save(customer);
		}

		catch(Exception e){
			System.out.println("msg in catch"+e.getMessage());
		}

		return customer;
	
		// TODO Auto-generated method stub
	}
}
