package com.scuttler.vegetable.shared;

import com.scuttler.vegetable.common.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VegetableService {

    @Autowired
    @Qualifier("InMemVeg")
    VegetableRepository vegetableRepository;

    public List<Vegetable> getAllVegetables() {
        return vegetableRepository.getAllVegetables();
    }

    public Vegetable getVegetableByName(String name) {
        return vegetableRepository.getVegetableByName(name);
    }

    public void addVegetable(Vegetable vegetable) {
        vegetableRepository.addVegetable(vegetable);
    }

    public void deleteVegetableByName(String name) {
        vegetableRepository.deleteVegetableByName(name);
    }
}
