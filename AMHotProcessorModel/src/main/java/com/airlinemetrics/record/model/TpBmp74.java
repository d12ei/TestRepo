package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.util.Date;

public class TpBmp74 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String additionalPrintLinesID;
    private int addBy;
    private Date addDate;
    private int modifyBy;
    private Date modifyDate;
    private String plid;
    private String pltx;
    private java.math.BigInteger ticketHeadId;

    public TpBmp74() {
    }

    public String getAdditionalPrintLinesID() {
        return this.additionalPrintLinesID;
    }

    public void setAdditionalPrintLinesID(String additionalPrintLinesID) {
        this.additionalPrintLinesID = additionalPrintLinesID;
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

    public String getPlid() {
        return this.plid;
    }

    public void setPlid(String plid) {
        this.plid = plid;
    }

    public String getPltx() {
        return this.pltx;
    }

    public void setPltx(String pltx) {
        this.pltx = pltx;
    }

    public java.math.BigInteger getTicketHeadId() {
        return this.ticketHeadId;
    }

    public void setTicketHeadId(java.math.BigInteger ticketHeadId) {
        this.ticketHeadId = ticketHeadId;
    }
}
