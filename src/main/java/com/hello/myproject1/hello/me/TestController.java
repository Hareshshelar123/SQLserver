package com.hello.myproject1.hello.me;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.myproject1.configur.MyTest;
import com.hello.myproject1.service.TestService;

@RestController
@RequestMapping("/api")
public class TestController {
	
	@Autowired
	private TestService service;
	
	@PostMapping("/save")
	public MyTest savealltest(@RequestBody MyTest myTest)
	{
		return service.saveall(myTest);
	}
	
	
}
