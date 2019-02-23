package com.alatheer.elmalekabdelaziz.Models;

/**
 * Created by elashry on 30/07/2018.
 */

public class DiscreteModel {
    private int image;
    private String title;

    public DiscreteModel(int image, String title) {
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }
}
