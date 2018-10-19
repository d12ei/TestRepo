package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.util.Date;

public class TpBkf81 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String fareCalculationID;
    private int addBy;
    private Date addDate;
    private String frca;
    private String frcs;
    private int modifyBy;
    private Date modifyDate;
    private java.math.BigInteger ticketHeadId;

    public TpBkf81() {
    }

    public String getFareCalculationID() {
        return this.fareCalculationID;
    }

    public void setFareCalculationID(String fareCalculationID) {
        this.fareCalculationID = fareCalculationID;
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

    public String getFrca() {
        return this.frca;
    }

    public void setFrca(String frca) {
        this.frca = frca;
    }

    public String getFrcs() {
        return this.frcs;
    }

    public void setFrcs(String frcs) {
        this.frcs = frcs;
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
