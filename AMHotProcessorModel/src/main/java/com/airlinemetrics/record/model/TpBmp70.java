package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.util.Date;

public class TpBmp70 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String ticketHeadId;
    private int addBy;
    private Date addDate;
    private int modifyBy;
    private Date modifyDate;
    private String rfic;
    private String rfid;

    public TpBmp70() {
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

    public String getRfic() {
        return this.rfic;
    }

    public void setRfic(String rfic) {
        this.rfic = rfic;
    }

    public String getRfid() {
        return this.rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid;
    }
}
