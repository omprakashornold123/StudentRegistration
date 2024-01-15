package com.student.registraion.controller;

import com.student.registraion.dtos.StudentDTO;
import com.student.registraion.enitites.Student;
import com.student.registraion.repository.StudentRepo;
import com.student.registraion.service.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @GetMapping("/")
    public String loadForm(Model model){
        loadFormData(model);
        return "index";
    }

    public void loadFormData(Model model){
        List<String>  courseList=List.of("Core Java","Adv Java","Spring Boot Microservices","java real time project");
        List<String> timingList=List.of("Morning","Afternoon","Evening");
        Student student= new Student();
        model.addAttribute( "courseList",courseList );
        model.addAttribute( "timingList",timingList );
        model.addAttribute(  "student",student);
    }


    @PostMapping("/save")
    public  String handleSumbitBtn(StudentDTO studentDTO, Model model){
        Student student=new Student();
        BeanUtils.copyProperties( studentDTO,student );
        student.setTimings( new String[]{Arrays.toString( studentDTO.getTimings() )} );
        model.addAttribute( "msg", "Student saved");
        studentRepo.save( student );
        loadFormData(model);
        return "index";
    }


}
