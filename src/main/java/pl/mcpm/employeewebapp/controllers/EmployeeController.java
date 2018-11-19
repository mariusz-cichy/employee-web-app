package pl.mcpm.employeewebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @RequestMapping("/employee/show")
    public String showEmployee() {
        return "employee/show";
    }
}
