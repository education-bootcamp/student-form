package com.studentapp.controller;

import com.studentapp.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(path = "/home")
    public String loadHome(){
        return "home-page";
    }

    @RequestMapping(path = "/new-student")
    public String loadNewStudentPage(){
        return "student-new";
    }

    @RequestMapping(path = "/create-student", method = RequestMethod.POST)
    public String createStudent(@ModelAttribute Student student){
        System.out.println(student);
        return "student-new";
    }
}
