package com.saraya.NongoYi.controller;

import com.saraya.NongoYi.entity.NongoEntity;
import com.saraya.NongoYi.service.NongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NongoController {
    @Autowired
    NongoService nongoService;

    @GetMapping("/index")
    public String showNongos(ModelMap modelMap){
        modelMap.addAttribute("nongos",nongoService.getNongos());
        return "index";
    }
    @PostMapping("/index")
    public String addNongo(@RequestParam String prenomNom,@RequestParam Long phoneNumber,@RequestParam String adress){
        nongoService.insertNongo(new NongoEntity(prenomNom,adress,phoneNumber));
        return "redirect:/index";
    }


}
