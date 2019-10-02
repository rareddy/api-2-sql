package com.example.cats;

import java.util.List;

public class Cat {
    String name;
    String breed;
    List<String> moods;
    Owner owner;
    List<Traits> traits;

    public Cat(String name, String breed, List<String> moods, Owner o, List<Traits> traits) {
        this.name = name;
        this.breed = breed;
        this.moods = moods;
        this.owner = o;
        this.traits = traits;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Traits> getTraits() {
        return traits;
    }

    public void setTraits(List<Traits> traits) {
        this.traits = traits;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public List<String> getMoods() {
        return moods;
    }

    public void setMoods(List<String> moods) {
        this.moods = moods;
    }
}
