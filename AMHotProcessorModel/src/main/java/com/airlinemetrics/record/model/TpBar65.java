package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.util.Date;

public class TpBar65 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String ticketHeadId;
    private int addBy;
    private Date addDate;
    private String dobr;
    private int modifyBy;
    private Date modifyDate;
    private String pxda;
    private String pxnm;
    private String pxtp;

    public TpBar65() {
    }

    public String getTicketHeadId() {
        return this.ticketHeadId;
    }

    public void setTicketHeadId(String ticketHeadId) {
        this.ticketHeadId = ticketHeadId;
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

    public String getDobr() {
        return this.dobr;
    }

    public void setDobr(String dobr) {
        this.dobr = dobr;
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

    public String getPxda() {
        return this.pxda;
    }

    public void setPxda(String pxda) {
        this.pxda = pxda;
    }

    public String getPxnm() {
        return this.pxnm;
    }

    public void setPxnm(String pxnm) {
        this.pxnm = pxnm;
    }

    public String getPxtp() {
        return this.pxtp;
    }

    public void setPxtp(String pxtp) {
        this.pxtp = pxtp;
    }
}
