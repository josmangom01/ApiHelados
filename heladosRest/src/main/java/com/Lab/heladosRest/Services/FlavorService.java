package com.Lab.heladosRest.Services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Lab.heladosRest.Repository.FlavorReposotory;
import com.Lab.heladosRest.models.Flavor;

@Service
public class FlavorService {

    FlavorReposotory reposotory;

    public FlavorService(FlavorReposotory reposotory){
        this.reposotory = reposotory;
    }

    public ResponseEntity<Flavor> createFlavor(Flavor flavor){
        if (flavor.getId() != 0) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        reposotory.save(flavor);
        return new ResponseEntity<>(flavor, HttpStatus.CREATED);
    }

    public List<Flavor> getAllFlavors(){
        return reposotory.findAll();
    }

    public ResponseEntity<Flavor> updateFlavor(int id, Flavor flavor){
        if (flavor.getId() != 0 && flavor.getId() != id) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Flavor f = new Flavor(id, flavor.getFlavorName());
        reposotory.save(f);
        return new ResponseEntity<>(f, HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteFlavor(int id){
        if (reposotory.findById(id).isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        reposotory.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
