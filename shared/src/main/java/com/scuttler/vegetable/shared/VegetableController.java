package com.scuttler.vegetable.shared;

//import com.fasterxml.jackson.annotation.JsonView;
import com.scuttler.vegetable.common.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VegetableController {

    @Autowired
    VegetableService vegetableService;

//    @JsonView(Vegetable.VegetableViewSummary.class)
    @RequestMapping("/")
    public List<Vegetable> getAllVegetables() {
        return vegetableService.getAllVegetables();
    }

    @RequestMapping(value="/{name}")
    public Vegetable getVegetableByName(@PathVariable String name) {
        return vegetableService.getVegetableByName(name);
    }

}