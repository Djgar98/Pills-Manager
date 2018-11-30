package com.example.atferworks.pillsmanager.Modelo;

public class CAT_ALLERGIES {

    private String PK_IDALLERGIES;
    private String NAME;
    private String DESCRIPTION;

    public CAT_ALLERGIES(){};

    public CAT_ALLERGIES(String PK_IDALLERGIES, String NAME, String DESCRIPTION) {
        this.PK_IDALLERGIES = PK_IDALLERGIES;
        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getPK_IDALLERGIES() {
        return PK_IDALLERGIES;
    }

    public String getNAME() {
        return NAME;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }
}
