package com.example.day01;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository
 extends JpaRepository<Employee, Integer> {

//    @Query("select * from employee where age>= ?")
//    List<T> findAllByAge(int age);
}
