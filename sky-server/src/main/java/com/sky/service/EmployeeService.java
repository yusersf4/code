package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

     void update(EmployeeDTO employeeDTO);

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     * @param emplyeeDTO
     */
    void save(EmployeeDTO emplyeeDTO);

    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    void startOrStop(Integer status, Long id);

    Employee getById(Long id);
}
