package com.example.onepiececharacters;

import java.io.Serializable;

public class CharacterInfo implements Serializable {
    String name;
    String crew;
    int image;
    String info;

    public CharacterInfo(String name, String crew, int image, String info) {
        this.name = name;
        this.crew = crew;
        this.image = image;
        this.info = info;
    }
}
