package com.company;

public final class  Village extends Region {
    private String nameOfVillage;
    private int numbersOfHome;

    public Village(int numbersOfRegin, String address, Continent continent, Assessment assessment,
                   int numbersOfPeople, int numbersOfVillage, String nameOfVillage, int numbersOfHome) {
        super(numbersOfRegin, address, continent, assessment, numbersOfPeople, numbersOfVillage);
        this.nameOfVillage = nameOfVillage;
        this.numbersOfHome = numbersOfHome;
    }

    public String getNameOfVillage() {
        return nameOfVillage;
    }

    public int getNumbersOfHome() {
        return numbersOfHome;
    }
}

