package com.spring_dockerizing;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@AllArgsConstructor
public class SimpleController {
    private final EmployeeRepo repo;

    @GetMapping("/hello")
    String hello() {
        return "<h1>Hello from Docker!!!</h1>";
    }

    @GetMapping("/employees")
    List<Employee> list() {
        return repo.saveAll(
                List.of(
                        new Employee("Vasia", "Pupkin", 1),
                        new Employee("Gena", "Doe", 1),
                        new Employee("Ann", "Smith", 3)
                )
        );
    }
}
