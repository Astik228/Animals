package com.example.demo.controller;

import com.example.demo.model.Animals;
import com.example.demo.service.AnimalService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

    @CrossOrigin
    @RestController
    @RequestMapping(AnimalsController.URL_ANIMAL)
    public class AnimalsController {
        public static final String URL_ANIMAL = "/api/v1/animals";

        private final AnimalService animalService;

        public AnimalsController(AnimalService animalService) {
            this.animalService=animalService;
        }
        @GetMapping
        public List<Animals> getAnimals() {
            return this.animalService.findAllAnimals();
        }

        @GetMapping("/{id}")
        public Animals getAnimalsById(@PathVariable Long id){
            return this.animalService.findAllAnimalsById(id);
        }

        @PostMapping
        public Animals saveAnimal(@RequestBody Animals a) {
            return this.animalService.saveAnimal(a);
        }

        @DeleteMapping("/{id}")
        public void deleteAnimalById(@PathVariable long id){
           animalService.deleteAnimalById(id);
            System.out.println("Удалено!");
        }
        @DeleteMapping()
        public void deleteAll(){
            animalService.deleteAll();
        }
         @PutMapping()
        public void updateAnimal(@RequestBody Animals a){
                this.animalService.updateAnimal(a);
         }


    }

