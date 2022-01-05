package com.company;

import java.awt.*;

public class Country {
    private int numbersOfRegin;
    private String address;
    private Continent continent;
    private Assessment assessment;

    public Country(int numbersOfRegin, String address, Continent continent, Assessment assessment) {
        this.numbersOfRegin = numbersOfRegin;
        this.address = address;
        this.continent = continent;
        this.assessment = assessment;
    }

    public int getNumbersOfRegin() {
        return numbersOfRegin;
    }

    public String getAddress() {
        return address;
    }

    public Continent getContinent() {
        return continent;
    }

    public Assessment getAssessment() {
        return assessment;
    }
}
