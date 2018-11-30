package com.example.atferworks.pillsmanager.Modelo;

public class CONTACTS {
    private String PK_IDCONTACT;
    private String NAME;
    private String PHONENUMBER;

    public CONTACTS(){};

    public CONTACTS(String PK_IDCONTACT, String NAME, String PHONENUMBER) {
        this.PK_IDCONTACT = PK_IDCONTACT;
        this.NAME = NAME;
        this.PHONENUMBER = PHONENUMBER;
    }

    public String getPK_IDCONTACT() {
        return PK_IDCONTACT;
    }

    public String getNAME() {
        return NAME;
    }

    public String getPHONENUMBER() {
        return PHONENUMBER;
    }
}
