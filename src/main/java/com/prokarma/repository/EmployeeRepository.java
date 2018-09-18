package com.prokarma.repository;

import org.springframework.data.repository.CrudRepository;

import com.prokarma.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{

}
