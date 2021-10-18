package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TestService;
import com.example.demo.vo.Employee;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/")
public class TestController {
	
	private TestService testService;
	
	@GetMapping("/test")
    List<Employee> testGet(){
		return testService.selectTest();
    }
	
	// 직원 ALL 조회
	@GetMapping("/all")
	List<Employee> findAllEmployees() {
		return testService.findAllEmployees();
	}
	
	// 직원등록
	
	// 직원삭제(ID)
	
	// 직원조회(ID)
	
	// 직원이름변경(ID)
	
	// 전체조회(ID)
}
