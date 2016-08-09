package com.sjob.vegviewer.sharedService;

import com.sjob.vegviewer.common.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VegetableService {

    @Autowired
    VegetableRepository vegetableRepository;

    public List<Vegetable> getAllVegetables() {
        return vegetableRepository.getAllVegetables();
    }
}
