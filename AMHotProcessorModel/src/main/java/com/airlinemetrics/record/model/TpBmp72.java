package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.util.Date;

public class TpBmp72 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String ticketHeadId;
    private int addBy;
    private Date addDate;
    private String amil;
    private int modifyBy;
    private Date modifyDate;

    public TpBmp72() {
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

    public String getAmil() {
        return this.amil;
    }

    public void setAmil(String amil) {
        this.amil = amil;
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
}
