package com.alatheer.charities.Models;

/**
 * Created by elashry on 30/07/2018.
 */

public class SliderModel {
    private int image;
    private String title;
    private String content;

    public SliderModel(int image, String title, String content) {
        this.image = image;
        this.title = title;
        this.content = content;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
