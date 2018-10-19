package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.util.Date;

public class TpBcc82 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String additionalCardID;
    private int addBy;
    private Date addDate;
    private String fpti;
    private String fptp;
    private int modifyBy;
    private Date modifyDate;
    private java.math.BigInteger ticketHeadId;

    public TpBcc82() {
    }

    public String getAdditionalCardID() {
        return this.additionalCardID;
    }

    public void setAdditionalCardID(String additionalCardID) {
        this.additionalCardID = additionalCardID;
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

    public String getFpti() {
        return this.fpti;
    }

    public void setFpti(String fpti) {
        this.fpti = fpti;
    }

    public String getFptp() {
        return this.fptp;
    }

    public void setFptp(String fptp) {
        this.fptp = fptp;
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
