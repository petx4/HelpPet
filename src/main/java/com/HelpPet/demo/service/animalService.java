package com.HelpPet.demo.service;

import com.HelpPet.demo.entity.Animal;
import com.HelpPet.demo.repository.animalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class animalService {

    public void cadastrarAnimal(Animal animation){
        Animal animal = new Animal();
        animal.setNome(animation.getNome());
        animal.setCastrado(animation.getCastrado());
        animal.setCor(animation.getCor());
        animal.setPeso(animation.getPeso());
        animal.setPrazoVacinacao(animation.getPrazoVacinacao());
        animal.setRaca(animation.getRaca());
        animal.setDataNacimento(animation.getDataNacimento());
        animal.setGeneroFM(animation.getGeneroFM());
        animal.setEspecieAnimal(animation.getEspecieAnimal());
        animalRepository.save(animal);

    }
    @Autowired
    animalRepository animalRepository;
    public List<Animal> mostraranimal() {
        List<Animal> lista = new ArrayList<>();
        lista = animalRepository.findAll();
        return lista;
    }
}
