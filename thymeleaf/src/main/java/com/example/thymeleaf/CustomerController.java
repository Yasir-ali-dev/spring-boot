package com.example.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    @GetMapping("/")
    public String getCustomerForm (Model model){
        model.addAttribute("customer",new Customer());
        return "customer-form";
    }
}
