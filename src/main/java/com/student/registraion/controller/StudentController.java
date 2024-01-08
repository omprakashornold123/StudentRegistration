package com.student.registraion.controller;

import com.student.registraion.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String loadFormD(Model model){

        loadFormData(model);
        return "index";
    }

    public void loadFormData(Model model){
        List<String>  courses=List.of("Core Java","Adv Java","Spring Boot Microservices","java real time project");


    }


}
