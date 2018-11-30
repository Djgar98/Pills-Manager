package com.example.atferworks.pillsmanager.Modelo;

public class CAT_RH {
    private String PK_IDRH;
    private String NAME;
    private String TYPE;

    public CAT_RH(){};

    public CAT_RH(String PK_IDRH, String NAME, String TYPE) {
        this.PK_IDRH = PK_IDRH;
        this.NAME = NAME;
        this.TYPE = TYPE;
    }

    public String getPK_IDRH() {
        return PK_IDRH;
    }

    public String getNAME() {
        return NAME;
    }

    public String getTYPE() {
        return TYPE;
    }
}
