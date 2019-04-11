package com.example.demo.service;

import com.example.demo.model.Animals;

import java.util.List;

public interface AnimalService {
    List<Animals> findAllAnimals();
    Animals findAllAnimalsById(Long id);
    Animals saveAnimal (Animals a);

}
