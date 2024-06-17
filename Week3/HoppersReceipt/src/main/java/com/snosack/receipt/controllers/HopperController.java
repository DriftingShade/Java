package com.snosack.receipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HopperController {
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Shane Nosack";
        String itemName = "RX 4090";
        double price = 1003.69;
        String description = "Fast GPU";
        String vendor = "Newegg";
    
    	// Your code here! Add values to the view model to be rendered
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);
    
        return "index.jsp";
    }
    


}
