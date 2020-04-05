package com.company;

public class Plane {
    private String name;
    private int dateOfCreate; //only year
    private int amountOfWheel;
    private String nameOfPilot;
    private String nameOfCountryOfMade;
public static class Builder{
    private Plane newPlain;
public Builder (){
newPlain = new Plane();
}
    public Builder withName(String name){
        newPlain.name = name;
        return this;
    }
    public Builder withdateOfCreate(int dateOfCreate){
        newPlain.dateOfCreate = dateOfCreate;
        return this;
    }
    public Builder withAmountOfWheell(int amountOfWhell){
        newPlain.amountOfWheel = amountOfWhell;
        return this;
    }
    public Builder withnameofpilot(String nameOfPilot){
        newPlain.nameOfPilot = nameOfPilot;
        return this;
    }
    public Builder withNameOfCountryOfMade(String nameOfCountryOfMade){
        newPlain.nameOfCountryOfMade = nameOfCountryOfMade;
        return this;
    }


}
}
