package co.edu.iudigital.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.iudigital.app.model.EmployeeEntity;

@Repository
public interface EmployeeRepository extends 
							CrudRepository<EmployeeEntity, Long>{
}
