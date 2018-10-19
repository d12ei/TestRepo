package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.util.Date;

public class TpBmp78 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String ticketHeadId;
    private int addBy;
    private Date addDate;
    private int modifyBy;
    private Date modifyDate;
    private String plid1;
    private String plid2;
    private String spin1;
    private String spin2;

    public TpBmp78() {
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

    public String getPlid1() {
        return this.plid1;
    }

    public void setPlid1(String plid1) {
        this.plid1 = plid1;
    }

    public String getPlid2() {
        return this.plid2;
    }

    public void setPlid2(String plid2) {
        this.plid2 = plid2;
    }

    public String getSpin1() {
        return this.spin1;
    }

    public void setSpin1(String spin1) {
        this.spin1 = spin1;
    }

    public String getSpin2() {
        return this.spin2;
    }

    public void setSpin2(String spin2) {
        this.spin2 = spin2;
    }
}
