package com.company;

public class Continent {
    private String nameOfContinent;
    private int numbersOfCountry;

    public Continent(String nameOfContinent, int numbersOfCountry) {
        this.nameOfContinent = nameOfContinent;
        this.numbersOfCountry = numbersOfCountry;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public int getNumbersOfCountry() {
        return numbersOfCountry;
    }
}
