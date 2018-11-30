package com.example.atferworks.pillsmanager.Modelo;

public class CAT_ILLNESSES {
    private String PK_IDILLNESS;
    private String NAME;

    public CAT_ILLNESSES(){}

    public CAT_ILLNESSES(String PK_IDILLNESS, String NAME) {
        this.PK_IDILLNESS = PK_IDILLNESS;
        this.NAME = NAME;

    }

    public String getPK_IDILLNESS() {
        return PK_IDILLNESS;
    }

    public String getNAME() {
        return NAME;
    }
}
