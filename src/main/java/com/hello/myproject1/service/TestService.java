package com.hello.myproject1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.myproject1.configur.MyTest;
import com.hello.myproject1.repository.TestRepository;

@Service
public class TestService {
	
	@Autowired
	private TestRepository repository;
	
	
	public MyTest saveall(MyTest test)
	{
		return repository.save(test);
	}

}
