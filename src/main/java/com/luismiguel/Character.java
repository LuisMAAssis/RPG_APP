package com.luismiguel;

public class Character {

    public String charName;
    public String tendency;
    public int age;
    public String race;
    public String background;

    public Character(String charName, String race, int age, String tendency, String background) {
        this.charName = charName;
        this.race = race;
        this.age = age;
        this.tendency = tendency;
        this.background = background;
    }

    public String getCharName() {
        return charName;
    }

    public String getTendency()  {
        return tendency;
    }

    public String getRace()  {
        return race;
    }

    public String getBackground()  {
        return background;
    }

    public int getAge()  {
        return age;
    }
}
