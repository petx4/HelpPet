package com.HelpPet.demo.controller;

import com.HelpPet.demo.entity.Animal;
import com.HelpPet.demo.service.animalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("animal")
public class animalController {
    @Autowired
    animalService animalService;

    @GetMapping
    public List<Animal> mostar(){
return animalService.mostraranimal();
    }

    @PostMapping
    public void cadastrar(){
        return animalService.cadastrarAnimal();
    }
}
