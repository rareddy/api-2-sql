package com.example.cats;

public class Traits {
	int id;
    String trait;

    public Traits(int id, String trait) {
    	this.id = id;
        this.trait = trait;
    }

    public String getTrait() {
        return trait;
    }

    public void setTrait(String trait) {
        this.trait = trait;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
