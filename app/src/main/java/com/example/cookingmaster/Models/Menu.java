package com.example.cookingmaster.Models;

public class Menu {

    int image;
    String name, clori, min, view;

    public Menu(int image, String name, String clori, String min, String view) {
        this.image = image;
        this.name = name;
        this.clori = clori;
        this.min = min;
        this.view = view;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClori() {
        return clori;
    }

    public void setClori(String clori) {
        this.clori = clori;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }
}
