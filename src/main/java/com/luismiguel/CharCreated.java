package com.luismiguel;

import java.util.ArrayList;
import java.util.List;

public class CharCreated {

    private List<Character> characters;

    public CharCreated() {
        characters = new ArrayList<>();
    }

    public void registerChar(Character character) {
       characters.add(character);
    }

    public List<Character> consultChar() {
        return characters;
    }

}
