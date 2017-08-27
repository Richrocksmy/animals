package com.twentyThreeSquared.animals.repository;

import com.twentyThreeSquared.animals.repository.entity.Animal;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AnimalRepository extends MongoRepository<Animal, String> {

    List<Animal> findAll();
    Animal findById(String id);
    Animal save(Animal animal);

}
