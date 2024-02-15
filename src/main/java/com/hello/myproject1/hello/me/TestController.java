package com.hello.myproject1.hello.me;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.myproject1.configur.MyTest;
import com.hello.myproject1.service.TestService;

@RestController
public class TestController {
	
	@Autowired
	private TestService service;
	
	@RequestMapping("/save")
	public List<MyTest> savealltest()
	{
		return service.saveall();
	}
	
	
}
