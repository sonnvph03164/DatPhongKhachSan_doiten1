package me.sabareesh.trippie.model;


public class Category {

    private String name;
    private int thumbnail;

    public Category(String name, int thumbnail) {
        this.name = name;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThumbnail() {
        return thumbnail;
    }

}
