package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TpBks39 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String commissionID;
    private int addBy;
    private Date addDate;
    private BigDecimal apbc;
    private BigDecimal coam;
    private String cort;
    private String cotp;
    private String cutp;
    private BigDecimal efco;
    private String efrt;
    private int modifyBy;
    private Date modifyDate;
    private String rdii;
    private int seqno;
    private BigDecimal spam;
    private String sprt;
    private String sptp;
    private String stat;
    private java.math.BigInteger ticketHeadId;

    public TpBks39() {
    }

    public String getCommissionID() {
        return this.commissionID;
    }

    public void setCommissionID(String commissionID) {
        this.commissionID = commissionID;
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

    public BigDecimal getApbc() {
        return this.apbc;
    }

    public void setApbc(BigDecimal apbc) {
        this.apbc = apbc;
    }

    public BigDecimal getCoam() {
        return this.coam;
    }

    public void setCoam(BigDecimal coam) {
        this.coam = coam;
    }

    public String getCort() {
        return this.cort;
    }

    public void setCort(String cort) {
        this.cort = cort;
    }

    public String getCotp() {
        return this.cotp;
    }

    public void setCotp(String cotp) {
        this.cotp = cotp;
    }

    public String getCutp() {
        return this.cutp;
    }

    public void setCutp(String cutp) {
        this.cutp = cutp;
    }

    public BigDecimal getEfco() {
        return this.efco;
    }

    public void setEfco(BigDecimal efco) {
        this.efco = efco;
    }

    public String getEfrt() {
        return this.efrt;
    }

    public void setEfrt(String efrt) {
        this.efrt = efrt;
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

    public String getRdii() {
        return this.rdii;
    }

    public void setRdii(String rdii) {
        this.rdii = rdii;
    }

    public int getSeqno() {
        return this.seqno;
    }

    public void setSeqno(int seqno) {
        this.seqno = seqno;
    }

    public BigDecimal getSpam() {
        return this.spam;
    }

    public void setSpam(BigDecimal spam) {
        this.spam = spam;
    }

    public String getSprt() {
        return this.sprt;
    }

    public void setSprt(String sprt) {
        this.sprt = sprt;
    }

    public String getSptp() {
        return this.sptp;
    }

    public void setSptp(String sptp) {
        this.sptp = sptp;
    }

    public String getStat() {
        return this.stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public java.math.BigInteger getTicketHeadId() {
        return this.ticketHeadId;
    }

    public void setTicketHeadId(java.math.BigInteger ticketHeadId) {
        this.ticketHeadId = ticketHeadId;
    }
}
