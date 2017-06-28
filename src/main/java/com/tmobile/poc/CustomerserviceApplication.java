package com.tmobile.poc;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CustomerserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerserviceApplication.class, args);
	}
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();
	}
	
	/*@PostConstruct
	public static void init() {
		fillCustomerInfoMap();
	}*/

	/*private static void fillCustomerInfoMap() {
		CustomerVO customer = new CustomerVO();
		customer.setCustomerId(1);
		customer.setPhoneNumber("470-985-0288");
		customer.setDob("03-18-1989");
		customer.setFirstName("Akbar");
		customer.setLastName("Zindani");
		customer.setSsn("111-111-1111");
		
	}*/
	
}
