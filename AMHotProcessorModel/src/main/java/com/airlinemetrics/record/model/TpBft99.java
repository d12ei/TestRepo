package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TpBft99 implements Serializable {

    private static final long serialVersionUID = 1L;
    private int hotFileId;
    private int addBy;
    private Date addDate;
    private String cutp;
    private BigDecimal gros;
    private int modifyBy;
    private Date modifyDate;
    private String ofcc;
    private BigDecimal tcom;
    private BigDecimal tlrp;
    private BigDecimal trem;
    private BigDecimal ttca;
    private BigDecimal ttmf;

    public TpBft99() {
    }

    public int getHotFileId() {
        return this.hotFileId;
    }

    public void setHotFileId(int hotFileId) {
        this.hotFileId = hotFileId;
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

    public String getCutp() {
        return this.cutp;
    }

    public void setCutp(String cutp) {
        this.cutp = cutp;
    }

    public BigDecimal getGros() {
        return this.gros;
    }

    public void setGros(BigDecimal gros) {
        this.gros = gros;
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

    public String getOfcc() {
        return this.ofcc;
    }

    public void setOfcc(String ofcc) {
        this.ofcc = ofcc;
    }

    public BigDecimal getTcom() {
        return this.tcom;
    }

    public void setTcom(BigDecimal tcom) {
        this.tcom = tcom;
    }

    public BigDecimal getTlrp() {
        return this.tlrp;
    }

    public void setTlrp(BigDecimal tlrp) {
        this.tlrp = tlrp;
    }

    public BigDecimal getTrem() {
        return this.trem;
    }

    public void setTrem(BigDecimal trem) {
        this.trem = trem;
    }

    public BigDecimal getTtca() {
        return this.ttca;
    }

    public void setTtca(BigDecimal ttca) {
        this.ttca = ttca;
    }

    public BigDecimal getTtmf() {
        return this.ttmf;
    }

    public void setTtmf(BigDecimal ttmf) {
        this.ttmf = ttmf;
    }
}
