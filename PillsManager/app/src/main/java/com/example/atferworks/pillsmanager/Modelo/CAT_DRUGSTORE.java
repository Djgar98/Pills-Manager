package com.example.atferworks.pillsmanager.Modelo;

public class CAT_DRUGSTORE {
    private String DRUGSTORE;
    private String NAME;
    private String LOCATION;
    private String PHONENUMBER;
    private String ADDRESS;

    public CAT_DRUGSTORE(){};

    public CAT_DRUGSTORE(String DRUGSTORE, String NAME, String LOCATION, String PHONENUMBER, String ADDRESS) {
        this.DRUGSTORE = DRUGSTORE;
        this.NAME = NAME;
        this.LOCATION = LOCATION;
        this.PHONENUMBER = PHONENUMBER;
        this.ADDRESS = ADDRESS;
    }

    public String getDRUGSTORE() {
        return DRUGSTORE;
    }

    public String getNAME() {
        return NAME;
    }

    public String getLOCATION() {
        return LOCATION;
    }

    public String getPHONENUMBER() {
        return PHONENUMBER;
    }

    public String getADDRESS() {
        return ADDRESS;
    }
}
