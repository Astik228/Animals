package com.example.demo.service;

import com.example.demo.model.Animals;
import com.example.demo.repository.AnimalsRep;

import java.util.List;

public class AnimalServiceImpl implements  AnimalService {
    private final AnimalsRep animalsRep;

    public AnimalServiceImpl(AnimalsRep animalsRep) {
        this.animalsRep = animalsRep;
    }

    @Override
    public List<AnimalService> findAllAnimals() {
        return null;
    }

    @Override
    public Animals findAllAnimalsById(Long id) {
        return null;
    }

    @Override
    public Animals saveAnimal(Animals a) {
        return null;
    }

}
