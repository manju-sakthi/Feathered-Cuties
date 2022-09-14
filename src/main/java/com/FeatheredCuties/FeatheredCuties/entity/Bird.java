package com.FeatheredCuties.FeatheredCuties.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bird {
@Id

    private String name;
    private int noOfPairForSale;
    private int pairPrice;
    private String colour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfPairForSale() {
        return noOfPairForSale;
    }

    public void setNoOfPairForSale(int noOfPairForSale) {
        this.noOfPairForSale = noOfPairForSale;
    }

    public int getPairPrice() {
        return pairPrice;
    }

    public void setPairPrice(int pairPrice) {
        this.pairPrice = pairPrice;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Bird() {
    }

    public Bird(String name, int noOfPairForSale, int pairPrice, String colour) {
        this.name = name;
        this.noOfPairForSale = noOfPairForSale;
        this.pairPrice = pairPrice;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", noOfPairForSale=" + noOfPairForSale +
                ", pairPrice=" + pairPrice +
                ", colour='" + colour + '\'' +
                '}';
    }
}

