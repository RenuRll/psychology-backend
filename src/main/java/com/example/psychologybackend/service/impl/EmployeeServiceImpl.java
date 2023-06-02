package com.example.psychologybackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.psychologybackend.entity.Employee;
import com.example.psychologybackend.mapper.EmployeeMapper;
import com.example.psychologybackend.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
* @author renu
* @description 针对表【employee】的数据库操作Service实现
* @createDate 2023-06-02 16:18:03
*/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
    implements EmployeeService {

}




