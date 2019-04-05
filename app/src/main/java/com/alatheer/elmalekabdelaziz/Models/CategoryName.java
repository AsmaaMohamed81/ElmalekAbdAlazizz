package com.alatheer.elmalekabdelaziz.Models;

/**
 * Created by M.Hamada on 03/04/2019.
 */

public class CategoryName {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String title;
    String description;
    int image;

    public CategoryName(String name, String title, String description, int image) {
        this.name = name;
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
