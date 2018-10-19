package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class TpBks30 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String documentAmountID;
    private int addBy;
    private Date addDate;
    private BigDecimal cobl;
    private String cutp;
    private BigDecimal lrep;
    private int modifyBy;
    private Date modifyDate;
    private BigDecimal ntfa;
    private int seqno;
    private BigDecimal tdam;
    private BigInteger ticketHeadId;
    private BigDecimal tmfa1;
    private BigDecimal tmfa2;
    private String tmfa3;
    private String tmft1;
    private String tmft2;
    private String tmft3;

    public TpBks30() {
    }

    public String getDocumentAmountID() {
        return this.documentAmountID;
    }

    public void setDocumentAmountID(String documentAmountID) {
        this.documentAmountID = documentAmountID;
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

    public BigDecimal getCobl() {
        return this.cobl;
    }

    public void setCobl(BigDecimal cobl) {
        this.cobl = cobl;
    }

    public String getCutp() {
        return this.cutp;
    }

    public void setCutp(String cutp) {
        this.cutp = cutp;
    }

    public BigDecimal getLrep() {
        return this.lrep;
    }

    public void setLrep(BigDecimal lrep) {
        this.lrep = lrep;
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

    public BigDecimal getNtfa() {
        return this.ntfa;
    }

    public void setNtfa(BigDecimal ntfa) {
        this.ntfa = ntfa;
    }

    public int getSeqno() {
        return this.seqno;
    }

    public void setSeqno(int seqno) {
        this.seqno = seqno;
    }

    public BigDecimal getTdam() {
        return this.tdam;
    }

    public void setTdam(BigDecimal tdam) {
        this.tdam = tdam;
    }

    public java.math.BigInteger getTicketHeadId() {
        return this.ticketHeadId;
    }

    public void setTicketHeadId(java.math.BigInteger ticketHeadId) {
        this.ticketHeadId = ticketHeadId;
    }

    public BigDecimal getTmfa1() {
        return this.tmfa1;
    }

    public void setTmfa1(BigDecimal tmfa1) {
        this.tmfa1 = tmfa1;
    }

    public BigDecimal getTmfa2() {
        return this.tmfa2;
    }

    public void setTmfa2(BigDecimal tmfa2) {
        this.tmfa2 = tmfa2;
    }

    public String getTmfa3() {
        return this.tmfa3;
    }

    public void setTmfa3(String tmfa3) {
        this.tmfa3 = tmfa3;
    }

    public String getTmft1() {
        return this.tmft1;
    }

    public void setTmft1(String tmft1) {
        this.tmft1 = tmft1;
    }

    public String getTmft2() {
        return this.tmft2;
    }

    public void setTmft2(String tmft2) {
        this.tmft2 = tmft2;
    }

    public String getTmft3() {
        return this.tmft3;
    }

    public void setTmft3(String tmft3) {
        this.tmft3 = tmft3;
    }
}
