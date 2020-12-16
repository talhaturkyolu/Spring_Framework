package com.befty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getRequestMapping() {

        return "home";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/talha")
    public String getRequestMapping2() {

        return "home";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/befty")
    public String getRequestMapping3() {

        return "home";
    }

    @GetMapping("/spring")
    public String getMappingExample() {
        return "home";
    }

    @PostMapping("/spring")
    public String postMappingExample() {
        return "home";
    }

    @GetMapping("/home/{name}")
    public String pathVariableEx(@PathVariable("name") String name) {
        System.out.println("name is :" + name);
        return "home";
    }

    @GetMapping("/home/{name}/{email}")
    public String pathVariableEx(@PathVariable("name") String name, @PathVariable("email") String email) {
        System.out.println("name is :" + name);
        System.out.println("email is :" + email);
        return "home";
    }

    @GetMapping(value = "/home/course")
    public String requestParamEx(@RequestParam("course") String course) {
        System.out.println("name is: " + course);
        return "home";
    }

    @GetMapping(value = "/course")
    public String requestParamEx2(@RequestParam(value = "name", required = false, defaultValue = "Befty") String name) {
        System.out.println("name is: " + name);
        return "home";
    }

    @GetMapping(value = "home/course2")
    public String requestParamEx3(@RequestParam(value = "course2", required = false, defaultValue = "Befty") String name) {
        System.out.println("name is: " + name);
        return "home";
    }
}
