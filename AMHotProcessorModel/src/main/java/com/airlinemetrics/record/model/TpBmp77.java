package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.util.Date;

public class TpBmp77 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String ticketHeadId;
    private int addBy;
    private Date addDate;
    private String cpnr;
    private int modifyBy;
    private Date modifyDate;
    private String plid;
    private String pltx;

    public TpBmp77() {
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

    public String getCpnr() {
        return this.cpnr;
    }

    public void setCpnr(String cpnr) {
        this.cpnr = cpnr;
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
}
