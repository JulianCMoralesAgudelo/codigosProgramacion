package co.edu.iudigital.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.app.RecordNotFoundException.RecordNotFoundException;
import co.edu.iudigital.app.model.EmployeeEntity;
import co.edu.iudigital.app.repository.EmployeeRepository;

// se anota con service para que entre al contenedor
// de Spring
@Service
public class EmployeeService {

	// inyección de dependencias
	@Autowired
	private EmployeeRepository employeeRepository;

	// consulta todos los empleados de la tabla
	// TBL_EMPLOYEE
	public List<EmployeeEntity> getAllEmployees() {
		List<EmployeeEntity> result = (List<EmployeeEntity>) employeeRepository.findAll();
		if (result.size() > 0) {
			return result;
		}
		return new ArrayList<EmployeeEntity>();
	}

	// consulta por Id de employee
	public EmployeeEntity getEmployeeById(Long id) throws RecordNotFoundException {
		Optional<EmployeeEntity> employee = employeeRepository.findById(id);
		if (employee.isPresent()) {
			return employee.get();
		}
		return new EmployeeEntity();
	}

	// consulta por Id de persona
	public EmployeeEntity createOrUpdateEmployee(EmployeeEntity employee) {
		// Si Id es nulo guarda
		Long id = employee.getId();
		if (id == null) {
			employee = employeeRepository.save(employee);
			return employee;
		}
// si Id no es nulo actualiza
		Optional<EmployeeEntity> currentEmployee = employeeRepository.findById(id);
		if (currentEmployee.isPresent()) {
			EmployeeEntity newEmployee = currentEmployee.get();
			newEmployee.setEmail(employee.getEmail());
			newEmployee.setFirstName(employee.getFirstName());
			newEmployee.setLastName(employee.getLastName());
			newEmployee = employeeRepository.save(newEmployee);
			return newEmployee;
		} else { // si no lo encuentra lo crea
			employee = employeeRepository.save(employee);
			return employee;
		}
	}

	// borra empleado por Id
	public void deleteEmployeeById(Long id) throws RecordNotFoundException {
		Optional<EmployeeEntity> employee = employeeRepository.findById(id);// busca por id
		if (employee.isPresent()) {// si lo encuentra lo borra
			employeeRepository.deleteById(id);
		} else {// sino lo encuentra lanza excepcion Not Found
			throw new RecordNotFoundException("No existe empleado");
		}
	}
}
