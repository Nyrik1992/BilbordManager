package ru.netology.manager;

public class Film {
    private int id;
    private String name;


    public Film(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public Film() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

