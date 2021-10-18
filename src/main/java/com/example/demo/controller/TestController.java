package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TestService;
import com.example.demo.vo.Employee;

@RestController
@RequestMapping(value = "/")
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping("/test")
    String testGet(){
		//return testService.selectTest().get(0).getEmployeeName();
		return "yeop";
    }
	
	// 직원등록
	
	// 직원삭제(ID)
	
	// 직원조회(ID)
	
	// 직원이름변경(ID)
	
	// 전체조회(ID)
}
