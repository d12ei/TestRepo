package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class TpBkp84 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String formOfPaymentID;
    private int addBy;
    private Date addDate;
    private String aplc;
    private String cutp;
    private String cvvr;
    private String exda;
    private String expc;
    private String fpac;
    private BigDecimal fpam;
    private String fptp;
    private String invd;
    private String invn;
    private int modifyBy;
    private Date modifyDate;
    private BigDecimal remt;
    private BigDecimal sfam;
    private BigInteger transHeadId;

    public TpBkp84() {
    }

    public String getFormOfPaymentID() {
        return this.formOfPaymentID;
    }

    public void setFormOfPaymentID(String formOfPaymentID) {
        this.formOfPaymentID = formOfPaymentID;
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

    public String getAplc() {
        return this.aplc;
    }

    public void setAplc(String aplc) {
        this.aplc = aplc;
    }

    public String getCutp() {
        return this.cutp;
    }

    public void setCutp(String cutp) {
        this.cutp = cutp;
    }

    public String getCvvr() {
        return this.cvvr;
    }

    public void setCvvr(String cvvr) {
        this.cvvr = cvvr;
    }

    public String getExda() {
        return this.exda;
    }

    public void setExda(String exda) {
        this.exda = exda;
    }

    public String getExpc() {
        return this.expc;
    }

    public void setExpc(String expc) {
        this.expc = expc;
    }

    public String getFpac() {
        return this.fpac;
    }

    public void setFpac(String fpac) {
        this.fpac = fpac;
    }

    public BigDecimal getFpam() {
        return this.fpam;
    }

    public void setFpam(BigDecimal fpam) {
        this.fpam = fpam;
    }

    public String getFptp() {
        return this.fptp;
    }

    public void setFptp(String fptp) {
        this.fptp = fptp;
    }

    public String getInvd() {
        return this.invd;
    }

    public void setInvd(String invd) {
        this.invd = invd;
    }

    public String getInvn() {
        return this.invn;
    }

    public void setInvn(String invn) {
        this.invn = invn;
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

    public BigDecimal getRemt() {
        return this.remt;
    }

    public void setRemt(BigDecimal remt) {
        this.remt = remt;
    }

    public BigDecimal getSfam() {
        return this.sfam;
    }

    public void setSfam(BigDecimal sfam) {
        this.sfam = sfam;
    }

    public java.math.BigInteger getTransHeadId() {
        return this.transHeadId;
    }

    public void setTransHeadId(java.math.BigInteger transHeadId) {
        this.transHeadId = transHeadId;
    }
}
