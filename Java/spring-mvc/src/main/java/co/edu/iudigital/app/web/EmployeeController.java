package co.edu.iudigital.app.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.iudigital.app.model.EmployeeEntity;
import co.edu.iudigital.app.service.EmployeeService;

@Controller
@RequestMapping("/")
public class EmployeeController {

	// Inyeccion de dependencias
	@Autowired
	private EmployeeService employeeService;

	// Consultar los empleados
	@RequestMapping
	public String getAllEmployees(Model model) {
		List<EmployeeEntity> list = employeeService.getAllEmployees();
		model.addAttribute("employees", list);
		if (list.size() == 0) {
			list = null;
		}
		model.addAttribute("employees", list);
		return "list-employees";
	}

}
