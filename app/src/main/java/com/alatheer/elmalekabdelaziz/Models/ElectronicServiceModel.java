package com.alatheer.elmalekabdelaziz.Models;

import java.util.List;

/**
 * Created by M.Hamada on 03/04/2019.
 */

public class ElectronicServiceModel {
  String name;
  List<ElectronicServiceDetailsModel>electronicServiceDetailsModelList;

    public ElectronicServiceModel(String name, List<ElectronicServiceDetailsModel> electronicServiceDetailsModelList) {
        this.name = name;
        this.electronicServiceDetailsModelList = electronicServiceDetailsModelList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ElectronicServiceDetailsModel> getElectronicServiceDetailsModelList() {
        return electronicServiceDetailsModelList;
    }

    public void setElectronicServiceDetailsModelList(List<ElectronicServiceDetailsModel> electronicServiceDetailsModelList) {
        this.electronicServiceDetailsModelList = electronicServiceDetailsModelList;
    }
}
