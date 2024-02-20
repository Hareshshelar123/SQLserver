package com.hello.myproject1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.myproject1.entity.MyTest;
import com.hello.myproject1.repository.TestRepository;

@Service
public class TestService {
	
	@Autowired
	private TestRepository repository;
	

	
	public MyTest savetest(MyTest test)
	{
		return repository.save(test);
	}
	
	public List<MyTest> getTest()
	{
		return repository.findAll();
	}


}
