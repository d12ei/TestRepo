package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class TpBks47 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nettingValueID;
    private int addBy;
    private Date addDate;
    private String cutp;
    private int modifyBy;
    private Date modifyDate;
    private BigDecimal ntta1;
    private BigDecimal ntta2;
    private BigDecimal ntta3;
    private BigDecimal ntta4;
    private String nttc1;
    private String nttc2;
    private String nttc3;
    private String nttc4;
    private String nttp1;
    private String nttp2;
    private String nttp3;
    private String nttp4;
    private BigInteger ticketHeadId;

    public TpBks47() {
    }

    public String getNettingValueID() {
        return this.nettingValueID;
    }

    public void setNettingValueID(String nettingValueID) {
        this.nettingValueID = nettingValueID;
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

    public BigDecimal getNtta1() {
        return this.ntta1;
    }

    public void setNtta1(BigDecimal ntta1) {
        this.ntta1 = ntta1;
    }

    public BigDecimal getNtta2() {
        return this.ntta2;
    }

    public void setNtta2(BigDecimal ntta2) {
        this.ntta2 = ntta2;
    }

    public BigDecimal getNtta3() {
        return this.ntta3;
    }

    public void setNtta3(BigDecimal ntta3) {
        this.ntta3 = ntta3;
    }

    public BigDecimal getNtta4() {
        return this.ntta4;
    }

    public void setNtta4(BigDecimal ntta4) {
        this.ntta4 = ntta4;
    }

    public String getNttc1() {
        return this.nttc1;
    }

    public void setNttc1(String nttc1) {
        this.nttc1 = nttc1;
    }

    public String getNttc2() {
        return this.nttc2;
    }

    public void setNttc2(String nttc2) {
        this.nttc2 = nttc2;
    }

    public String getNttc3() {
        return this.nttc3;
    }

    public void setNttc3(String nttc3) {
        this.nttc3 = nttc3;
    }

    public String getNttc4() {
        return this.nttc4;
    }

    public void setNttc4(String nttc4) {
        this.nttc4 = nttc4;
    }

    public String getNttp1() {
        return this.nttp1;
    }

    public void setNttp1(String nttp1) {
        this.nttp1 = nttp1;
    }

    public String getNttp2() {
        return this.nttp2;
    }

    public void setNttp2(String nttp2) {
        this.nttp2 = nttp2;
    }

    public String getNttp3() {
        return this.nttp3;
    }

    public void setNttp3(String nttp3) {
        this.nttp3 = nttp3;
    }

    public String getNttp4() {
        return this.nttp4;
    }

    public void setNttp4(String nttp4) {
        this.nttp4 = nttp4;
    }

    public java.math.BigInteger getTicketHeadId() {
        return this.ticketHeadId;
    }

    public void setTicketHeadId(java.math.BigInteger ticketHeadId) {
        this.ticketHeadId = ticketHeadId;
    }
}
