package com.twentyThreeSquared.animals.persistence.repository;

import com.twentyThreeSquared.animals.persistence.entity.Animal;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AnimalRepository extends MongoRepository<Animal, String> {

    List<Animal> findAll();
    Animal findById(String id);
    Animal save(Animal animal);

}
