package com.example.atferworks.pillsmanager.Modelo;

public class USER_ALLERGIES {
    private String FK_IDUSER;
    private String FK_ALLERGIES;

    public USER_ALLERGIES(){};

    public USER_ALLERGIES(String FK_IDUSER, String FK_ALLERGIES) {
        this.FK_IDUSER = FK_IDUSER;
        this.FK_ALLERGIES = FK_ALLERGIES;
    }

    public String getFK_IDUSER() {
        return FK_IDUSER;
    }

    public String getFK_ALLERGIES() {
        return FK_ALLERGIES;
    }
}
