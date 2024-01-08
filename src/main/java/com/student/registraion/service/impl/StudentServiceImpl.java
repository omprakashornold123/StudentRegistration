package com.student.registraion.service.impl;

import com.student.registraion.repository.StudentRepo;
import com.student.registraion.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;


}
