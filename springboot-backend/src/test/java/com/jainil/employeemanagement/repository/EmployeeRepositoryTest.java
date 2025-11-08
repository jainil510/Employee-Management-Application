package com.jainil.employeemanagement.repository;

import com.jainil.employeemanagement.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testFindByDepartment() {
        // Given
        Employee employee1 = new Employee("Jainil", "Patel", "jainil@example.com", "IT");
        Employee employee2 = new Employee("John", "Doe", "john@example.com", "HR");
        Employee employee3 = new Employee("Jane", "Smith", "jane@example.com", "IT");
        employeeRepository.saveAll(List.of(employee1, employee2, employee3));

        // When
        List<Employee> itEmployees = employeeRepository.findByDepartment("IT
");

        // Then
        assertThat(itEmployees).hasSize(2);
        assertThat(itEmployees).extracting(Employee::getDepartment).containsOnly("IT
");
    }

    @Test
    public void testSave() {
        // Given
        Employee employee = new Employee("Jainil", "Patel", "jainil@example.com", "IT");

        // When
        Employee savedEmployee = employeeRepository.save(employee);

        // Then
        assertThat(savedEmployee).isNotNull();
        assertThat(savedEmployee.getId()).isGreaterThan(0);
    }
}
