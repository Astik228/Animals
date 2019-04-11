package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table
public class Animals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double age;
    private String place;
    private double weight;

    public Animals() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Animals(Long id, String name, double age, String place, double weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.place = place;
        this.weight = weight;
    }
}
