
package jar;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee updateEmployee(int id, Employee employee) {
        Employee existing = employeeRepository.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(employee.getName());
            existing.setDepartment(employee.getDepartment());
            existing.setSalary(employee.getSalary());

            return employeeRepository.save(existing);
        }

        return null;
    }

    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
    
    public Page<Employee> getEmployeesPage(int page, int size) {
        return employeeRepository.findAll(PageRequest.of(page, size));
    }
}
