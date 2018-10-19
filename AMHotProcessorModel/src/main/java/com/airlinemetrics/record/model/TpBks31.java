package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TpBks31 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String couponTaxID;
    private int addBy;
    private Date addDate;
    private BigDecimal ctaa1;
    private BigDecimal ctaa2;
    private String ctac1;
    private String ctac2;
    private String ctcd1;
    private String ctcd2;
    private BigDecimal ctra1;
    private BigDecimal ctra2;
    private String cutp;
    private String cutx1;
    private String cutx2;
    private int modifyBy;
    private Date modifyDate;
    private String segi1;
    private String segi2;
    private String stac1;
    private String stac2;
    private java.math.BigInteger ticketHeadId;

    public TpBks31() {
    }

    public String getCouponTaxID() {
        return this.couponTaxID;
    }

    public void setCouponTaxID(String couponTaxID) {
        this.couponTaxID = couponTaxID;
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

    public BigDecimal getCtaa1() {
        return this.ctaa1;
    }

    public void setCtaa1(BigDecimal ctaa1) {
        this.ctaa1 = ctaa1;
    }

    public BigDecimal getCtaa2() {
        return this.ctaa2;
    }

    public void setCtaa2(BigDecimal ctaa2) {
        this.ctaa2 = ctaa2;
    }

    public String getCtac1() {
        return this.ctac1;
    }

    public void setCtac1(String ctac1) {
        this.ctac1 = ctac1;
    }

    public String getCtac2() {
        return this.ctac2;
    }

    public void setCtac2(String ctac2) {
        this.ctac2 = ctac2;
    }

    public String getCtcd1() {
        return this.ctcd1;
    }

    public void setCtcd1(String ctcd1) {
        this.ctcd1 = ctcd1;
    }

    public String getCtcd2() {
        return this.ctcd2;
    }

    public void setCtcd2(String ctcd2) {
        this.ctcd2 = ctcd2;
    }

    public BigDecimal getCtra1() {
        return this.ctra1;
    }

    public void setCtra1(BigDecimal ctra1) {
        this.ctra1 = ctra1;
    }

    public BigDecimal getCtra2() {
        return this.ctra2;
    }

    public void setCtra2(BigDecimal ctra2) {
        this.ctra2 = ctra2;
    }

    public String getCutp() {
        return this.cutp;
    }

    public void setCutp(String cutp) {
        this.cutp = cutp;
    }

    public String getCutx1() {
        return this.cutx1;
    }

    public void setCutx1(String cutx1) {
        this.cutx1 = cutx1;
    }

    public String getCutx2() {
        return this.cutx2;
    }

    public void setCutx2(String cutx2) {
        this.cutx2 = cutx2;
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

    public String getSegi1() {
        return this.segi1;
    }

    public void setSegi1(String segi1) {
        this.segi1 = segi1;
    }

    public String getSegi2() {
        return this.segi2;
    }

    public void setSegi2(String segi2) {
        this.segi2 = segi2;
    }

    public String getStac1() {
        return this.stac1;
    }

    public void setStac1(String stac1) {
        this.stac1 = stac1;
    }

    public String getStac2() {
        return this.stac2;
    }

    public void setStac2(String stac2) {
        this.stac2 = stac2;
    }

    public java.math.BigInteger getTicketHeadId() {
        return this.ticketHeadId;
    }

    public void setTicketHeadId(java.math.BigInteger ticketHeadId) {
        this.ticketHeadId = ticketHeadId;
    }
}
