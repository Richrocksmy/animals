package com.twentyThreeSquared.animals.controllers;

import com.twentyThreeSquared.animals.AnimalService;
import com.twentyThreeSquared.animals.repository.entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService service;

    @RequestMapping()
    public List<Animal> getAllAnimals() {
        return service.getAnimals();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Animal getAnimalById(@PathVariable("id") String id) {
        return service.getAnimal(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Animal createAnimal(@RequestBody Animal animal) {
        return service.createAnimal(animal);
    }
}
