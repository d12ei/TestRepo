package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.util.Date;

public class TpBks46 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String qualifyingIssueID;
    private int addBy;
    private Date addDate;
    private String enrs;
    private int modifyBy;
    private Date modifyDate;
    private String oria;
    private String orid;
    private String oril;
    private String orin;
    private String orit;
    private java.math.BigInteger ticketHeadId;
    private String trnn;

    public TpBks46() {
    }

    public String getQualifyingIssueID() {
        return this.qualifyingIssueID;
    }

    public void setQualifyingIssueID(String qualifyingIssueID) {
        this.qualifyingIssueID = qualifyingIssueID;
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

    public String getEnrs() {
        return this.enrs;
    }

    public void setEnrs(String enrs) {
        this.enrs = enrs;
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

    public String getOria() {
        return this.oria;
    }

    public void setOria(String oria) {
        this.oria = oria;
    }

    public String getOrid() {
        return this.orid;
    }

    public void setOrid(String orid) {
        this.orid = orid;
    }

    public String getOril() {
        return this.oril;
    }

    public void setOril(String oril) {
        this.oril = oril;
    }

    public String getOrin() {
        return this.orin;
    }

    public void setOrin(String orin) {
        this.orin = orin;
    }

    public String getOrit() {
        return this.orit;
    }

    public void setOrit(String orit) {
        this.orit = orit;
    }

    public java.math.BigInteger getTicketHeadId() {
        return this.ticketHeadId;
    }

    public void setTicketHeadId(java.math.BigInteger ticketHeadId) {
        this.ticketHeadId = ticketHeadId;
    }

    public String getTrnn() {
        return this.trnn;
    }

    public void setTrnn(String trnn) {
        this.trnn = trnn;
    }
}
