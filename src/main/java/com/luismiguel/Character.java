package com.luismiguel;

public class Character {

    public String charName;
    public String tendency;
    public int age;
    public String race;
    public String background;

    public Character(String charName, String tendency, String race, String background, int age) {
        this.charName = charName;
        this.tendency = tendency;
        this.race = race;
        this.background = background;
        this.age = age;
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
