package com.example.demo.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.vo.Employee;

//@Repository
public class TestMapperImpl implements TestMapper {

	@Override
	public List<Employee> selectTest() {
		
		Employee e = new Employee("12302","정재엽");
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e);
		
		return employees;
	}

	@Override
	public List<Employee> selectAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
