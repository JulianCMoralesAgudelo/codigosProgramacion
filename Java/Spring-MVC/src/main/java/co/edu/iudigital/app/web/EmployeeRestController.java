package co.edu.iudigital.app.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.app.model.EmployeeEntity;
import co.edu.iudigital.app.service.EmployeeService;

@RestController // para colocarlo en el contenedor de Spring e indicar un Controller Rest
@RequestMapping(value = "/rest")// endpoint
@CrossOrigin(origins = "*", methods = {RequestMethod.GET})//externos hagan peticion
public class EmployeeRestController {

	// inyección de dependencias
	@Autowired
	private EmployeeService employeeService;

	// Punto de peticion
	
	// punto de petición get
	@RequestMapping(value = {""}, method = RequestMethod.GET)
	public ResponseEntity<List<EmployeeEntity>> getAllEmployees() {
		return new ResponseEntity(employeeService.getAllEmployees(),
				HttpStatus.OK);
	}

}
