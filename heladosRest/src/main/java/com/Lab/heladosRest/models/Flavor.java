package com.Lab.heladosRest.models;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Flavor {
    @Id
    @GeneratedValue
    public int id;

    @Basic
    public String flavorName;

    public Flavor(int id, String flavorName){
        this.id = id;
        this.flavorName = flavorName;
    }

    public Flavor(){}

    public void setFlavor(String flavorName){
        this.flavorName = flavorName;
    }

    public String getFlavorName(){
        return this.flavorName;
    }

    public int getId(){
        return this.id;
    }
}
