package com.alatheer.elmalekabdelaziz.Models;

/**
 * Created by M.Hamada on 27/03/2019.
 */

public class AboutUsModel {
    CategoryName categoryName;

    public AboutUsModel(CategoryName categoryName) {
        this.categoryName = categoryName;
    }

    public CategoryName getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(CategoryName categoryName) {
        this.categoryName = categoryName;
    }
}
