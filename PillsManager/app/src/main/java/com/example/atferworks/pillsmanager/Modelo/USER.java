package com.example.atferworks.pillsmanager.Modelo;
//CREACION DE OBJETO USER CON ATRIBUTOS

public class USER
{
    private String PK_IDUSER;
    private String USERNAME;
    private String FIRSTNAME;
    private String LASTNAME;
    private String SEX;
    private String AGE;
    private String ADDRESS;
    private String PHONENUMBER;
    private String FK_IDCONTACT;
    private String FK_IDRH;

    public USER(){}

    public USER(String PK_IDUSER, String USERNAME, String FIRSTNAME, String LASTNAME, String SEX, String AGE, String ADDRESS, String PHONENUMBER, String FK_IDCONTACT, String FK_IDRH)
    {
        this.PK_IDUSER = PK_IDUSER;
        this.USERNAME = USERNAME;
        this.FIRSTNAME = FIRSTNAME;
        this.LASTNAME = LASTNAME;
        this.SEX = SEX;
        this.AGE = AGE;
        this.ADDRESS = ADDRESS;
        this.PHONENUMBER = PHONENUMBER;
        this.FK_IDCONTACT = FK_IDCONTACT;
        this.FK_IDRH = FK_IDRH;
    }

    public String getPK_IDUSER() {
        return PK_IDUSER;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getFIRSTNAME() {
        return FIRSTNAME;
    }

    public String getLASTNAME() {
        return LASTNAME;
    }

    public String getSEX() {
        return SEX;
    }

    public String getAGE() {
        return AGE;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public String getPHONENUMBER() {
        return PHONENUMBER;
    }

    public String getFK_IDCONTACT() {
        return FK_IDCONTACT;
    }

    public String getFK_IDRH() {
        return FK_IDRH;
    }

    USER user = new USER(PK_IDUSER, USERNAME,FIRSTNAME, LASTNAME, SEX, AGE, ADDRESS, PHONENUMBER, FK_IDCONTACT, FK_IDRH);
}


