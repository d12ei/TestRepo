package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.util.Date;

public class TpBmd76 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String couponRemarksID;
    private int addBy;
    private Date addDate;
    private String emcp;
    private String emrm;
    private int modifyBy;
    private Date modifyDate;
    private java.math.BigInteger ticketHeadId;

    public TpBmd76() {
    }

    public String getCouponRemarksID() {
        return this.couponRemarksID;
    }

    public void setCouponRemarksID(String couponRemarksID) {
        this.couponRemarksID = couponRemarksID;
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

    public String getEmcp() {
        return this.emcp;
    }

    public void setEmcp(String emcp) {
        this.emcp = emcp;
    }

    public String getEmrm() {
        return this.emrm;
    }

    public void setEmrm(String emrm) {
        this.emrm = emrm;
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
