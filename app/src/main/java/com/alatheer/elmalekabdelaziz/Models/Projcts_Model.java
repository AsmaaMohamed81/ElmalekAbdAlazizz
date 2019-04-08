package com.alatheer.elmalekabdelaziz.Models;

public class Projcts_Model {

    private int image;
    private String title;
    private String item1;
    private String desc_item1;
    private String item2;
    private String desc_item2;
    private String Description;


    public Projcts_Model(int image, String title, String item1, String desc_item1, String item2, String desc_item2, String description) {
        this.image = image;
        this.title = title;
        this.item1 = item1;
        this.desc_item1 = desc_item1;
        this.item2 = item2;
        this.desc_item2 = desc_item2;
        Description = description;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

    public String getItem1() {
        return item1;
    }

    public String getDesc_item1() {
        return desc_item1;
    }

    public String getItem2() {
        return item2;
    }

    public String getDesc_item2() {
        return desc_item2;
    }

    public String getDescription() {
        return Description;
    }
}
