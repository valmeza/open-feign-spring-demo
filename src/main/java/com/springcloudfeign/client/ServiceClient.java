package com.springcloudfeign.client;

import java.util.List;

import com.springcloudfeign.dto.ServiceResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "https://jsonplaceholder.typicode.com", name = "SERVICE-CLIENT")
public interface ServiceClient {

    @GetMapping("/posts")
    public List<ServiceResponse> getServices();
}
