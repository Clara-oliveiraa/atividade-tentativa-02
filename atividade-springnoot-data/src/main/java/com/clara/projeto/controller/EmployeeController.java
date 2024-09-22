package com.clara.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clara.projeto.model.Employee;
import com.clara.projeto.repository.EmployeeRepository;

@RestController
@RequestMapping("/employees")

public class EmployeeController {

   @Autowired
   private EmployeeRepository employeeRepository;

   // Método GET para listar todos os funcionários
   @GetMapping
   public List<Employee> getAllEmployees() {
      return employeeRepository.findAll();
   }

   // Método POST para criar um novo funcionário
   @PostMapping
   public Employee createEmployee(@RequestBody Employee employee) {
      return employeeRepository.save(employee);
   }
}
