package com.snosack.omikuji.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class OmikujiController {

    @GetMapping("/") 
    public String index() {
        return "redirect:/omikuji";
    }

    @GetMapping("/omikuji")
    public String omikuji() {
        return "index.jsp";
    }

    @PostMapping("/omikuji/submit")
    public String submitForm(@RequestParam("luckyNum") String luckyNum,
                             @RequestParam("city") String city,
                             @RequestParam("realPerson") String realPerson,
                             @RequestParam("hobby") String hobby,
                             @RequestParam("livingThing") String livingThing,
                             @RequestParam("somethingNice") String somethingNice,
                             HttpSession session) {
        session.setAttribute("luckyNum", luckyNum);
        session.setAttribute("city", city);
        session.setAttribute("realPerson", realPerson);
        session.setAttribute("hobby", hobby);
        session.setAttribute("livingThing", livingThing);
        session.setAttribute("somethingNice", somethingNice);
        return "redirect:/omikuji/show";
    }

    @GetMapping("/omikuji/show")
    public String showFortune(Model model, HttpSession session) {
        model.addAttribute("luckyNum", session.getAttribute("luckyNum"));
        model.addAttribute("city", session.getAttribute("city"));
        model.addAttribute("realPerson", session.getAttribute("realPerson"));
        model.addAttribute("hobby", session.getAttribute("hobby"));
        model.addAttribute("livingThing", session.getAttribute("livingThing"));
        model.addAttribute("somethingNice", session.getAttribute("somethingNice"));
        return "fortune.jsp";
    }
}

