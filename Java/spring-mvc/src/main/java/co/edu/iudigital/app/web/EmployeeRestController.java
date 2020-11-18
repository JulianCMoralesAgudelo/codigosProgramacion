package co.edu.iudigital.app.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.app.RecordNotFoundException.RecordNotFoundException;
import co.edu.iudigital.app.model.EmployeeEntity;
import co.edu.iudigital.app.service.EmployeeService;

@RestController // Para colocarlo en el contenedor de Spring e indicar un Controller Rest

@RequestMapping(value = "/rest") // endpoint

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE }) 


public class EmployeeRestController {

	// inyección de dependencias
	@Autowired
	private EmployeeService employeeService;

	// Punto de peticion

	// Punto de petición get
	@SuppressWarnings("unchecked")
	@RequestMapping(value = { "" }, method = RequestMethod.GET)
	public ResponseEntity<List<EmployeeEntity>> getAllEmployees() {
		return new ResponseEntity(employeeService.getAllEmployees(), HttpStatus.OK);
	}

	// Punto de petición get para obtener empleado por id
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public ResponseEntity<EmployeeEntity> get(@PathVariable("id") Long id) throws RecordNotFoundException {
		EmployeeEntity employee = employeeService.getEmployeeById(id);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}

	// Punto de petición post para crear o actualizar un empleado
	@RequestMapping(path = "/createorupdate", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<EmployeeEntity> createOrUpdate(@RequestBody EmployeeEntity employee) {
		return new ResponseEntity<>(employeeService.createOrUpdateEmployee(employee), HttpStatus.OK);
	}

	// punto de petición delete para borrar y devolver listado de empleados
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<List<EmployeeEntity>> delete(@PathVariable("id") Long id) throws RecordNotFoundException {
		employeeService.deleteEmployeeById(id);
		return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
	}

}
