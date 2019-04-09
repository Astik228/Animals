package com.example.demo.controller;

import com.example.demo.model.Animals;
import com.example.demo.service.AnimalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(AnimalsController.URL_COUNTRY)
public class AnimalsController {
    public static final String URL_COUNTRY = "/api/v1/animal";
    private final AnimalService animalService;

    public AnimalsController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<AnimalService> getAnimals() {
        return this.animalService.findAllAnimals();
    }

    @GetMapping("/{id}")
    public Animals getAnimalById(@PathVariable Long id){
        return this.animalService.findAllAnimalsById(id);
    }

    @PostMapping
    public Animals saveAnimal(@RequestBody Animals a) {
        return this.animalService.saveAnimal(a);
    }
}
