package com.ashish.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashish.entity.Emp;
import com.ashish.repository.empRepository;
@Service
public class EmpService {
	@Autowired
	empRepository repo;
	
	public Emp add(Emp emp) 
	 {
		 return repo.save(emp);
	 }
	
	public List <Emp> get() {
		return repo.findAll();
	}
	public Emp update (Emp emp) {
		return repo.save(emp);
		
	}

	public void  deleteEmp(int id) {
		  repo.deleteById(id);
	}

}
