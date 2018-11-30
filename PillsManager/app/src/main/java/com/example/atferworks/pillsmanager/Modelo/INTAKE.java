package com.example.atferworks.pillsmanager.Modelo;

public class INTAKE {
    private String FK_IDUSER;
    private String FK_IDDRUG;
    private String STARTDATE;
    private String FINISHDATE;
    private String DATE;
    private String PERIOD;
    private String STATUS;
    private String TIMELIMIT;

    public INTAKE(){}

    public INTAKE(String FK_IDUSER, String FK_IDDRUG, String STARTDATE, String FINISHDATE, String DATE, String PERIOD, String STATUS, String TIMELIMIT) {
        this.FK_IDUSER = FK_IDUSER;
        this.FK_IDDRUG = FK_IDDRUG;
        this.STARTDATE = STARTDATE;
        this.FINISHDATE = FINISHDATE;
        this.DATE = DATE;
        this.PERIOD = PERIOD;
        this.STATUS = STATUS;
        this.TIMELIMIT = TIMELIMIT;
    }

    public String getFK_IDUSER() {
        return FK_IDUSER;
    }

    public String getFK_IDDRUG() {
        return FK_IDDRUG;
    }

    public String getSTARTDATE() {
        return STARTDATE;
    }

    public String getFINISHDATE() {
        return FINISHDATE;
    }

    public String getDATE() {
        return DATE;
    }

    public String getPERIOD() {
        return PERIOD;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public String getTIMELIMIT() {
        return TIMELIMIT;
    }
}
