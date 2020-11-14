package co.edu.iudigital.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.app.model.EmployeeEntity;
import co.edu.iudigital.app.repository.EmployeeRepository;

// se anota con service para que entre al contenedor
// de Spring
@Service
public class EmployeeService {

	//inyección de dependencias
	@Autowired
	private EmployeeRepository employeeRepository;
	
	// consulta todos los empleados de la tabla 
	// TBL_EMPLOYEE
	public List<EmployeeEntity> getAllEmployees(){
		List<EmployeeEntity> result = 
				(List<EmployeeEntity>)employeeRepository.findAll();
		if(result.size() > 0) {
			return result;
		}
		return new ArrayList<EmployeeEntity>();
	}

}
