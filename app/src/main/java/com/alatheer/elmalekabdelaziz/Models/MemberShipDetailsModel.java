package com.alatheer.elmalekabdelaziz.Models;

/**
 * Created by M.Hamada on 03/04/2019.
 */

public class MemberShipDetailsModel {
    String title;
    String details;

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

    public MemberShipDetailsModel(String title, String details) {
        this.title = title;
        this.details = details;

    }
}
