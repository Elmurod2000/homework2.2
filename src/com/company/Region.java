package com.company;

public class Region extends Country {
    private int numbersOfPeople;
    private int numbersOfVillage;

    public Region(int numbersOfRegin, String address, Continent continent, Assessment assessment,
                  int numbersOfPeople, int numbersOfVillage) {
        super(numbersOfRegin, address, continent, assessment);
        this.numbersOfPeople = numbersOfPeople;
        this.numbersOfVillage = numbersOfVillage;
    }

    public int getNumbersOfPeople() {
        return numbersOfPeople;
    }

    public int getNumbersOfVillage() {
        return numbersOfVillage;
    }
    public final  void getInfo(int numbersOfPeople,int  numbersOfVillage){
        System.out.println("Populatio:"+numbersOfPeople+"Number Of Village"+numbersOfVillage);
    }
    public void getInfo(){
        System.out.println(
                "\nNumber Of Region"+numbersOfVillage+"Address"+getAddress()+
                        "Continent"+ getContinent().getNameOfContinent()+"" +
                        "Number Of Country"+getContinent().getNumbersOfCountry()+
                        "Assessment of Country"+getAssessment()+"Numbers of People"+getNumbersOfPeople()+
                        "Numbers Of Village"+getNumbersOfVillage());
    }
}
