package com.example.thymeleaf;

import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
    @GetMapping("/")
    public String getCustomerForm (Model model){
        model.addAttribute("customer",new Customer());
        return "customer-form";
    }

   @PostMapping("/processForm")
   String processTheForm (@Valid @ModelAttribute("customer") Customer customer , BindingResult bindingResult){
       System.out.println("|"+customer.getLastName()+"|");
       System.out.println(bindingResult.toString());

        if(bindingResult.hasErrors()){
            return "customer-form";
        }
        return"customer-confirmation";
   }

   @InitBinder
    public void initBinder(WebDataBinder dataBinder){
       StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
       dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
   }

}

