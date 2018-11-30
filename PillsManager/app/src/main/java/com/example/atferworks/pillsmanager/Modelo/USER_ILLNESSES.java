package com.example.atferworks.pillsmanager.Modelo;

public class USER_ILLNESSES {
    private String FK_IDUSER;
    private String FK_IDILLNESSES;

    public USER_ILLNESSES (){};

    public USER_ILLNESSES(String FK_IDUSER, String FK_IDILLNESSES) {
        this.FK_IDUSER = FK_IDUSER;
        this.FK_IDILLNESSES = FK_IDILLNESSES;
    }

    public String getFK_IDUSER() {
        return FK_IDUSER;
    }

    public String getFK_IDILLNESSES() {
        return FK_IDILLNESSES;
    }
}
