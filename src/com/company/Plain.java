package com.company;

import java.util.Locale;

public class Plain {
    private String name;
    private int dateOfCreate; //only year
    private int amountOfWheel;
    private String nameOfPilot;
    private String nameOfCountryOfMade;
public static class Builder{
    private Plain newPlain;
public Builder (){
newPlain = new Plain();
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
    public Builder withNameOfPilot(String nameOfPilot){
        newPlain.nameOfPilot = nameOfPilot;
        return this;
    }
    public Builder withNameOfCountryOfMade(String nameOfCountryOfMade){
        newPlain.nameOfCountryOfMade = nameOfCountryOfMade;
        return this;
    }


}
}
