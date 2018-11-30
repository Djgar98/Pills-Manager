package com.example.atferworks.pillsmanager.Modelo;

public class CAT_DRUG
{
    private String PK_IDDRUG;
    private String NAME;
    private String FRECUENCY;
    private String DESCRIPTION;

    public CAT_DRUG() {
    }

    public CAT_DRUG(String PK_IDDRUG, String NAME, String FRECUENCY, String DESCRIPTION) {
        this.PK_IDDRUG = PK_IDDRUG;
        this.NAME = NAME;
        this.FRECUENCY = FRECUENCY;
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getPK_IDDRUG() {
        return PK_IDDRUG;
    }

    public String getNAME() {
        return NAME;
    }

    public String getFRECUENCY() {
        return FRECUENCY;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }
}
