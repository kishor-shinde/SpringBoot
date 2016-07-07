package com.peoplefy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.peoplefy.domain.entity.EmployeeDetailss;
import com.peoplefy.repository.EmployeeRepo;

@RestController
public class GreetingController {

	@Autowired
	EmployeeRepo repo;
	
    @RequestMapping("/greeting")
    public String greeting(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @RequestMapping("/employees")
    public List<EmployeeDetailss> listEmployeea()
    {
    	ArrayList<EmployeeDetailss> list=new ArrayList<EmployeeDetailss>();
    	EmployeeDetailss ed=new EmployeeDetailss();
    	ed.setEmail("employee1@gmail.com");
    	ed.setName("Employee1");
    	ed.setId(1);
    	list.add(ed);
    	ed.setEmail("employee2@gmail.com");
    	ed.setName("Employee2");
    	ed.setId(2);
    	list.add(ed);
    	repo.save(ed);
    	
    	return repo.findAll();
    }
}
