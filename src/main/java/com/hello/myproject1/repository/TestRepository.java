package com.hello.myproject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hello.myproject1.entity.MyTest;

public interface TestRepository extends JpaRepository<MyTest , Integer>{

}
