package com.snosack.fruityloops.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.snosack.fruityloops.models.Item;

import org.springframework.ui.Model;

@Controller
public class ItemController {

    @RequestMapping("/")
    public String index(Model model) {
        ArrayList<Item> fruits = new ArrayList<>();
        fruits.add(new Item("Kiwi", 1.5));
        fruits.add(new Item("Mango", 2.0));
        fruits.add(new Item("Goji Berries", 4.0));
        fruits.add(new Item("Guava", .75));

        // Add fruits to the model
        model.addAttribute("fruits", fruits);

        return "index.jsp";
    }
}
