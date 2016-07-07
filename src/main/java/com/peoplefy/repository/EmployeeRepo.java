package com.peoplefy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peoplefy.domain.entity.EmployeeDetails;

public interface EmployeeRepo extends JpaRepository<EmployeeDetails, Integer> {

}
