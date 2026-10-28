package com.HelpPet.demo.repository;

import com.HelpPet.demo.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface animalRepository extends JpaRepository<Animal, Integer> {
}
