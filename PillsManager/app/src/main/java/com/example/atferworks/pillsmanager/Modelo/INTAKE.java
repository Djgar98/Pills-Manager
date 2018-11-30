package com.example.atferworks.pillsmanager.Modelo;

public class INTAKE {
    private int FK_IDUSER;
    private int FK_IDDRUG;
    private String STARTDATE;
    private String FINISHDATE;
    private String DATE;
    private String PERIOD;
    private int STATUS;
    private int TIMELIMIT;

    public INTAKE(){}

    public INTAKE(int FK_IDUSER, int FK_IDDRUG, String STARTDATE, String FINISHDATE, String DATE, String PERIOD, int STATUS, int TIMELIMIT) {
        this.FK_IDUSER = FK_IDUSER;
        this.FK_IDDRUG = FK_IDDRUG;
        this.STARTDATE = STARTDATE;
        this.FINISHDATE = FINISHDATE;
        this.DATE = DATE;
        this.PERIOD = PERIOD;
        this.STATUS = STATUS;
        this.TIMELIMIT = TIMELIMIT;
    }

    public int getFK_IDUSER() {
        return FK_IDUSER;
    }

    public int getFK_IDDRUG() {
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

    public int getSTATUS() {
        return STATUS;
    }

    public int getTIMELIMIT() {
        return TIMELIMIT;
    }
}
