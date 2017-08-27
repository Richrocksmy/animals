package com.twentyThreeSquared.animals;

import com.twentyThreeSquared.animals.repository.AnimalRepository;
import com.twentyThreeSquared.animals.repository.entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository repository;

    public List<Animal> getAnimals() {
        return repository.findAll();
    }

    public Animal getAnimal(String id) {
        return repository.findById(id);
    }

    public Animal createAnimal(Animal animal) {
        return repository.save(animal);
    }
}
