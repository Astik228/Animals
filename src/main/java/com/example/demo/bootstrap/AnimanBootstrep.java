package com.example.demo.bootstrap;

import com.example.demo.model.Animals;
import com.example.demo.repository.AnimalsRep;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AnimanBootstrep  implements CommandLineRunner {
    private final AnimalsRep animalsRep;

    public AnimanBootstrep(AnimalsRep animalsRep) {
        this.animalsRep = animalsRep;
    }

    @Override
    public void run(String... args) throws Exception {
        Animals animal = new Animals();
        animal.setName("Панда");
        animal.setAge(2);
        animalsRep.save(animal);

        Animals animal2 = new Animals();
        animal2.setName("Лев");
        animal2.setAge(7);
        animalsRep.save(animal2);

        Animals animal3 = new Animals();
        animal2.setName("Коала");
        animal2.setAge(10);
        animalsRep.save(animal3);
    }
}
