package com.peoplefy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peoplefy.domain.entity.EmployeeDetailss;

public interface EmployeeRepo extends JpaRepository<EmployeeDetailss, Integer> {

}
