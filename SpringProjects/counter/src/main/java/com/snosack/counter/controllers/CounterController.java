package com.snosack.counter.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {

    @GetMapping("/")
    public String index(HttpSession session) {
        // If the count is not already in session
        if (session.getAttribute("count") == null) {
            // Use setAttribute to initialize the count in session
            session.setAttribute("count", 0);
        } else {
            // Increment the count by 1 using getAttribute and setAttribute
            int count = (int) session.getAttribute("count");
            session.setAttribute("count", count + 1);
        }
        return "index.jsp";
    }

    @GetMapping("/counter")
    public String counter(HttpSession session, Model model) {
        // Retrieve the count from session
        int count = (int) session.getAttribute("count");
        // Add the count to the model to be displayed in the view
        model.addAttribute("count", count);
        return "counter.jsp";
    }

    @GetMapping("/increment")
    public String increment(HttpSession session) {
        int count = (int) session.getAttribute("count");
        session.setAttribute("count", count + 2);
        return "index.jsp";
    }

    @GetMapping("/reset")
    public String reset(HttpSession session) {
        session.setAttribute("count", 0);
        return "index.jsp";
    }
}
