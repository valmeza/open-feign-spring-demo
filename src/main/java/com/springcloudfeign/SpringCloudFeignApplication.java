package com.springcloudfeign;

import com.springcloudfeign.client.ServiceClient;
import com.springcloudfeign.dto.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@EnableFeignClients
public class SpringCloudFeignApplication {

	@Autowired
	private ServiceClient client;

	@GetMapping("/findAllServices")
	public List<ServiceResponse> getAllServices() {
		return client.getServices();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignApplication.class, args);
	}

}
