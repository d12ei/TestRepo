package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.util.Date;

public class TpBar66 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String additionalInformationID;
    private int addBy;
    private Date addDate;
    private String fpin;
    private String fpsn;
    private int modifyBy;
    private Date modifyDate;
    private java.math.BigInteger ticketHeadId;

    public TpBar66() {
    }

    public String getAdditionalInformationID() {
        return this.additionalInformationID;
    }

    public void setAdditionalInformationID(String additionalInformationID) {
        this.additionalInformationID = additionalInformationID;
    }

    public int getAddBy() {
        return this.addBy;
    }

    public void setAddBy(int addBy) {
        this.addBy = addBy;
    }

    public Date getAddDate() {
        return this.addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public String getFpin() {
        return this.fpin;
    }

    public void setFpin(String fpin) {
        this.fpin = fpin;
    }

    public String getFpsn() {
        return this.fpsn;
    }

    public void setFpsn(String fpsn) {
        this.fpsn = fpsn;
    }

    public int getModifyBy() {
        return this.modifyBy;
    }

    public void setModifyBy(int modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return this.modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public java.math.BigInteger getTicketHeadId() {
        return this.ticketHeadId;
    }

    public void setTicketHeadId(java.math.BigInteger ticketHeadId) {
        this.ticketHeadId = ticketHeadId;
    }
}
