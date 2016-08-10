package com.sjob.vegviewer.webDataIe8;

import com.sjob.vegviewer.common.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VegetableController {

    @Autowired
    VegetableService vegetableService;

    @RequestMapping("/")
    public List<Vegetable> getAllVegetables() {
        return vegetableService.getAllVegetables();
    }

    @RequestMapping(value="/{name}")
    public Vegetable getVegetableByName(@PathVariable String name) {
        return vegetableService.getVegetableByName(name);
    }
}