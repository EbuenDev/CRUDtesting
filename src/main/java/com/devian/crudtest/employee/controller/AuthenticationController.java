package com.devian.crudtest.employee.controller;


import com.devian.crudtest.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@Validated
public class AuthenticationController {

    private final EmployeeService employeeService;

    @GetMapping("/login")
    public String login() {
        return "login"; // login.html view
    }

    @GetMapping("/req/signup")
    public String signupForm() {
        return "signup"; // signup.html view
    }

    @PostMapping("/req/signup")
    public String signup(
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam(required = false) String role,
            Model model
    ) {
        try {
            employeeService.register(username, password, role);
            // Redirect to login page after successful registration
            return "redirect:/login?registered";
        } catch (IllegalArgumentException ex) {
            model.addAttribute("error", ex.getMessage());
            return "signup";
        }
    }
}




