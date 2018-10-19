package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class TpBmp71 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String miscAdditionalInfoID;
    private int addBy;
    private Date addDate;
    private String bera;
    private String cdgt;
    private String icdn;
    private int modifyBy;
    private Date modifyDate;
    private BigDecimal mpeq;
    private BigDecimal mpev;
    private BigDecimal mpoc;
    private BigDecimal mpsc;
    private BigDecimal mptx;
    private BigInteger ticketHeadId;

    public TpBmp71() {
    }

    public String getMiscAdditionalInfoID() {
        return this.miscAdditionalInfoID;
    }

    public void setMiscAdditionalInfoID(String miscAdditionalInfoID) {
        this.miscAdditionalInfoID = miscAdditionalInfoID;
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

    public String getBera() {
        return this.bera;
    }

    public void setBera(String bera) {
        this.bera = bera;
    }

    public String getCdgt() {
        return this.cdgt;
    }

    public void setCdgt(String cdgt) {
        this.cdgt = cdgt;
    }

    public String getIcdn() {
        return this.icdn;
    }

    public void setIcdn(String icdn) {
        this.icdn = icdn;
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

    public BigDecimal getMpeq() {
        return this.mpeq;
    }

    public void setMpeq(BigDecimal mpeq) {
        this.mpeq = mpeq;
    }

    public BigDecimal getMpev() {
        return this.mpev;
    }

    public void setMpev(BigDecimal mpev) {
        this.mpev = mpev;
    }

    public BigDecimal getMpoc() {
        return this.mpoc;
    }

    public void setMpoc(BigDecimal mpoc) {
        this.mpoc = mpoc;
    }

    public BigDecimal getMpsc() {
        return this.mpsc;
    }

    public void setMpsc(BigDecimal mpsc) {
        this.mpsc = mpsc;
    }

    public BigDecimal getMptx() {
        return this.mptx;
    }

    public void setMptx(BigDecimal mptx) {
        this.mptx = mptx;
    }

    public java.math.BigInteger getTicketHeadId() {
        return this.ticketHeadId;
    }

    public void setTicketHeadId(java.math.BigInteger ticketHeadId) {
        this.ticketHeadId = ticketHeadId;
    }
}
