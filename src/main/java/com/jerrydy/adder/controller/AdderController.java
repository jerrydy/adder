package com.jerrydy.adder.controller;

import com.jerrydy.adder.services.AdderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Jerry on 12/27/2015.
 */
@Controller
public class AdderController {

    @Autowired
    AdderService adderService;

    @RequestMapping(value="/", method = RequestMethod.POST)
    public String add(Model model, @RequestParam Long addend1, @RequestParam Long addend2) {
        model.addAttribute("sum", adderService.add(addend1, addend2).toString());
        return "adder";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String add() {
        return "adder";
    }
}
