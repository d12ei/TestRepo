package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TpBar64 implements Serializable {

    private static final long serialVersionUID = 1L;
    private int ticketHeadId;
    private int addBy;
    private Date addDate;
    private String baid;
    private String beot;
    private String boon;
    private BigDecimal eqfr;
    private String fare;
    private String fcmi;
    private String fcpi;
    private int modifyBy;
    private Date modifyDate;
    private String ntsi;
    private String sasi;
    private BigDecimal taxa1;
    private BigDecimal taxa2;
    private BigDecimal taxa3;
    private String tkmi;
    private String totl;

    public TpBar64() {
    }

    public int getTicketHeadId() {
        return this.ticketHeadId;
    }

    public void setTicketHeadId(int ticketHeadId) {
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

    public String getBaid() {
        return this.baid;
    }

    public void setBaid(String baid) {
        this.baid = baid;
    }

    public String getBeot() {
        return this.beot;
    }

    public void setBeot(String beot) {
        this.beot = beot;
    }

    public String getBoon() {
        return this.boon;
    }

    public void setBoon(String boon) {
        this.boon = boon;
    }

    public BigDecimal getEqfr() {
        return this.eqfr;
    }

    public void setEqfr(BigDecimal eqfr) {
        this.eqfr = eqfr;
    }

    public String getFare() {
        return this.fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public String getFcmi() {
        return this.fcmi;
    }

    public void setFcmi(String fcmi) {
        this.fcmi = fcmi;
    }

    public String getFcpi() {
        return this.fcpi;
    }

    public void setFcpi(String fcpi) {
        this.fcpi = fcpi;
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

    public String getNtsi() {
        return this.ntsi;
    }

    public void setNtsi(String ntsi) {
        this.ntsi = ntsi;
    }

    public String getSasi() {
        return this.sasi;
    }

    public void setSasi(String sasi) {
        this.sasi = sasi;
    }

    public BigDecimal getTaxa1() {
        return this.taxa1;
    }

    public void setTaxa1(BigDecimal taxa1) {
        this.taxa1 = taxa1;
    }

    public BigDecimal getTaxa2() {
        return this.taxa2;
    }

    public void setTaxa2(BigDecimal taxa2) {
        this.taxa2 = taxa2;
    }

    public BigDecimal getTaxa3() {
        return this.taxa3;
    }

    public void setTaxa3(BigDecimal taxa3) {
        this.taxa3 = taxa3;
    }

    public String getTkmi() {
        return this.tkmi;
    }

    public void setTkmi(String tkmi) {
        this.tkmi = tkmi;
    }

    public String getTotl() {
        return this.totl;
    }

    public void setTotl(String totl) {
        this.totl = totl;
    }
}
