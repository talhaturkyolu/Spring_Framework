package com.school.controller;

import com.school.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model) {

        String course = "MVC";
        model.addAttribute("name", "Talha");
        model.addAttribute("course", course);

        //create some random student id (0-1000) and show it in your user interface
        int studentid = new Random().nextInt(1000);
        model.addAttribute("id", studentid);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(45);
        numbers.add(6);
        numbers.add(42);
        numbers.add(6);
        numbers.add(42);
        model.addAttribute("numbers", numbers);

        //print your birthday
        LocalDate birthday = LocalDate.now().minusYears(26);
        model.addAttribute("birthday", birthday);

        Student student = new Student(1, "Talha", "Turkyolu");
        model.addAttribute("student", student);

        return "student/welcome";
    }

    @GetMapping("/register")
    public String homePage2() {
        return "student/register";
    }


}