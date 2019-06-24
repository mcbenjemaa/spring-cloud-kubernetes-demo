package com.github.medmedchiheb;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user-service", url = "http://user-service/")
@RibbonClient(name = "user-service")
public interface UserService {

	@GetMapping("/user")
	public String user();
}
