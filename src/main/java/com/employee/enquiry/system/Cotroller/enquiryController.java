package com.employee.enquiry.system.Cotroller;


import com.employee.enquiry.system.model.enquiry;
import com.employee.enquiry.system.service.serviceImp.enquiryserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/enquiry")
public class enquiryController {

    @Autowired
    enquiryserviceImpl enqImp;


    @GetMapping("/home")
    public String getHome(Model model){
        model.addAttribute("enq", new enquiry());
        return "home";
    }
    @PostMapping("/create")
    public String createEnquiry(@ModelAttribute("enq") enquiry enq){

        System.out.println(enq.getCustomerName());



        var result = enqImp.createEnquiry(enq);

        return "home";
    }
    @GetMapping ("/search")
    public String getByMobileNumber(@RequestParam String mobileNumber,Model model){
        var result = enqImp.getByMobileNumber(mobileNumber);
        if(result==null){
            return "home";
        }
        model.addAttribute("enq",result);
        return "update";
    }

}
