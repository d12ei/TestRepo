package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.util.Date;

public class TpBks45 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String ticketInfoID;
    private int addBy;
    private Date addDate;
    private String cdgt;
    private String dird;
    private int modifyBy;
    private Date modifyDate;
    private String rcpn;
    private String rmed;
    private String rmic;
    private String rtdn;
    private int seqno;
    private java.math.BigInteger ticketHeadId;
    private String wavr;

    public TpBks45() {
    }

    public String getTicketInfoID() {
        return this.ticketInfoID;
    }

    public void setTicketInfoID(String ticketInfoID) {
        this.ticketInfoID = ticketInfoID;
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

    public String getCdgt() {
        return this.cdgt;
    }

    public void setCdgt(String cdgt) {
        this.cdgt = cdgt;
    }

    public String getDird() {
        return this.dird;
    }

    public void setDird(String dird) {
        this.dird = dird;
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

    public String getRcpn() {
        return this.rcpn;
    }

    public void setRcpn(String rcpn) {
        this.rcpn = rcpn;
    }

    public String getRmed() {
        return this.rmed;
    }

    public void setRmed(String rmed) {
        this.rmed = rmed;
    }

    public String getRmic() {
        return this.rmic;
    }

    public void setRmic(String rmic) {
        this.rmic = rmic;
    }

    public String getRtdn() {
        return this.rtdn;
    }

    public void setRtdn(String rtdn) {
        this.rtdn = rtdn;
    }

    public int getSeqno() {
        return this.seqno;
    }

    public void setSeqno(int seqno) {
        this.seqno = seqno;
    }

    public java.math.BigInteger getTicketHeadId() {
        return this.ticketHeadId;
    }

    public void setTicketHeadId(java.math.BigInteger ticketHeadId) {
        this.ticketHeadId = ticketHeadId;
    }

    public String getWavr() {
        return this.wavr;
    }

    public void setWavr(String wavr) {
        this.wavr = wavr;
    }
}
