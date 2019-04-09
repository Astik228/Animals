package com.example.demo.repository;

import com.example.demo.model.Animals;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalsRep  extends JpaRepository<Animals, Long> {
}
