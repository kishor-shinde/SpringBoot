package com.peoplefy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.peoplefy.domain.entity.EmployeeDetails;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @RequestMapping("/employees")
    public List<EmployeeDetails> listEmployeea()
    {
    	ArrayList<EmployeeDetails> list=new ArrayList<EmployeeDetails>();
    	EmployeeDetails ed=new EmployeeDetails();
    	ed.setEmail("employee1@gmail.com");
    	ed.setName("Employee1");
    	ed.setId(1);
    	list.add(ed);
    	ed.setEmail("employee2@gmail.com");
    	ed.setName("Employee2");
    	ed.setId(2);
    	list.add(ed);
    	return list;
    }
}
