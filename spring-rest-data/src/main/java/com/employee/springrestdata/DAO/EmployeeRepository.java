package com.employee.springrestdata.DAO;

import com.employee.springrestdata.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "employees")
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}


