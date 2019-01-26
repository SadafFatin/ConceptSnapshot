package com.snapshot.coxsbazar.conceptsnapshot.model;

public class undpcontacts {

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getORGANISATION() {
        return ORGANISATION;
    }

    public void setORGANISATION(String ORGANISATION) {
        this.ORGANISATION = ORGANISATION;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPostion() {
        return Postion;
    }

    public void setPostion(String postion) {
        Postion = postion;
    }

    public undpcontacts(String NAME, String ORGANISATION, String EMAIL, String postion) {
        this.NAME = NAME;
        this.ORGANISATION = ORGANISATION;
        this.EMAIL = EMAIL;
        Postion = postion;
    }

    String NAME,ORGANISATION,EMAIL,Postion;
}
