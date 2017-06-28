package com.tmobile.poc.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.tmobile.poc.vo.CustomerVO;

@Repository


public interface CustomerDAORepository extends MongoRepository<CustomerVO, String> {

	
	 @Query("{'phoneNumber':?0}")
	 public CustomerVO findCustomerByPhoneNumber(@Param("phoneNumber") String phoneNumber);
	 
	
}
