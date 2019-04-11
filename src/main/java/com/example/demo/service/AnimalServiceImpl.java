package com.example.demo.service;

import com.example.demo.model.Animals;
import com.example.demo.repository.AnimalsRep;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnimalServiceImpl implements  AnimalService {
    private final AnimalsRep animalsRep;

    public AnimalServiceImpl(AnimalsRep animalsRep) {
        this.animalsRep = animalsRep;
    }

    @Override
    public List<Animals> findAllAnimals() {
        return this.animalsRep.findAll();
    }

    @Override
    public Animals findAllAnimalsById(Long id) {
        return this.animalsRep.findById(id).get();
    }

    @Override
    public Animals saveAnimal(Animals a) {
        return this.animalsRep.save(a);
    }

}
