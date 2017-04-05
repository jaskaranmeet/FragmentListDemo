package com.example.hp.fragmentlistdemo;

/**
 * Created by Hp on 28-Mar-17.
 */

public class SingleRow {
    private String name,desc;
    private int image;

    public SingleRow(String name, String desc, int image) {
        this.name = name;
        this.desc = desc;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getImage() {
        return image;
    }
}
