package com.alatheer.elmalekabdelaziz.Models;

import java.util.List;

/**
 * Created by M.Hamada on 03/04/2019.
 */

public class MemberShipModel {
    String name;
    List<MemberShipDetailsModel>memberShipDetails;

    public MemberShipModel(String name, List<MemberShipDetailsModel> memberShipDetails) {
        this.name=name;
        this.memberShipDetails=memberShipDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MemberShipDetailsModel> getMemberShipDetails() {
        return memberShipDetails;
    }

    public void setMemberShipDetails(List<MemberShipDetailsModel> memberShipDetails) {
        this.memberShipDetails = memberShipDetails;
    }
}
