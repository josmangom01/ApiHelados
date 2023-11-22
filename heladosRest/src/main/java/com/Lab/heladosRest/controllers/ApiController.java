package com.Lab.heladosRest.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Lab.heladosRest.Services.FlavorService;
import com.Lab.heladosRest.models.Flavor;

@RestController
@RequestMapping("icecream/API")
public class ApiController {

    FlavorService service;

    public ApiController(FlavorService service){
        this.service = service;
    }

    @GetMapping("/flavors")
    public List<Flavor> getFlavors(){
        return service.getAllFlavors();
    }

    @PutMapping("/flavors/{id}")
    public ResponseEntity<Flavor> updateFlavors(@PathVariable int id, @RequestBody Flavor flavor){
        return service.updateFlavor(id, flavor);
    }

    @PostMapping("/flavors")
    public ResponseEntity<Flavor> createFlavor(@RequestBody Flavor flavor){
        return service.createFlavor(flavor);
    }

    @DeleteMapping("/flavors/{id}")
    public ResponseEntity<Void> deleteFlavor(@PathVariable int id){
        return service.deleteFlavor(id);
    }
}
