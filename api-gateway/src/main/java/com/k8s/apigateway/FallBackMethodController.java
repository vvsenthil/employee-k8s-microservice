package com.k8s.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        return "User Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/employeeServiceFallBack")
    public String employeeServiceFallBackMethod() {
        return "Employee Service is taking longer than Expected." +
                " Please try again later";
    }
}
