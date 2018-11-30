package com.example.atferworks.pillsmanager.Modelo;

public class DRUG_DRUGSTORE {
    private String FK_IDDRUG;
    private String FK_IDDRUGSTORE;

    public DRUG_DRUGSTORE(){};

    public DRUG_DRUGSTORE(String FK_IDDRUG, String FK_IDDRUGSTORE) {
        this.FK_IDDRUG = FK_IDDRUG;
        this.FK_IDDRUGSTORE = FK_IDDRUGSTORE;
    }

    public String getFK_IDDRUG() {
        return FK_IDDRUG;
    }

    public String getFK_IDDRUGSTORE() {
        return FK_IDDRUGSTORE;
    }
}
