package com.luismiguel;

public class CharacterClass {

    public String className;
    public String armorClass;
    public boolean shield;
    public int experience;
    public String archetype;

    public CharacterClass(String className, String armorClass, boolean shield, int experience, String archetype) {
        this.className = className;
        this.armorClass = armorClass;
        this.shield = shield;
        this.experience = experience;
        this.archetype = archetype;
    }

    public String getClassName() {
        return className;
    }
    public String getArmorClass() {
        return armorClass;
    }
    public boolean getShield() {
        return shield;
    }
    public int getExperience() {
        return experience;
    }
    public String getArchetype() {
        return archetype;
    }

}
