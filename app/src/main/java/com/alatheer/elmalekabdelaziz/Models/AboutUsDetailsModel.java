package com.alatheer.elmalekabdelaziz.Models;

/**
 * Created by M.Hamada on 27/03/2019.
 */

public class AboutUsDetailsModel {

    String title;
    String details;
    int Image;

    public AboutUsDetailsModel(String title, String details, int Image) {
        this.title=title;
        this.details=details;
        this.Image=Image;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
