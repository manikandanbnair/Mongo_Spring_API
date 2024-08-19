package com.CombinedAPI.API.repositories;

import org.springframework.stereotype.Repository;
import com.CombinedAPI.API.model.EmployeeManagerModel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface EmployeeManagerCustomRepository {

    List<EmployeeManagerModel> getAllEmployees();
    
    EmployeeManagerModel findByIdCustom(String id);

    EmployeeManagerModel findByExistingManagerId(String managerId);
    
    EmployeeManagerModel findManagerByDepartment(String department);
    
    List<EmployeeManagerModel> getEmployeesByManagerIdAndJoiningDate(String managerId, LocalDateTime dateOfJoining);
    
    List<EmployeeManagerModel> findByManagerId(String managerId);
    
    List<EmployeeManagerModel> findByDepartment(String department);

    List<EmployeeManagerModel> findByDateOfJoiningBefore(LocalDate minJoiningDate);
}
