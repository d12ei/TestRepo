package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TpBks42 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String ticketHeadId;
    private int addBy;
    private Date addDate;
    private String cutp;
    private int modifyBy;
    private Date modifyDate;
    private String tctp1;
    private String tctp2;
    private String tctp3;
    private String tctp4;
    private BigDecimal toca1;
    private BigDecimal toca2;
    private BigDecimal toca3;
    private BigDecimal toca4;

    public TpBks42() {
    }

    public String getTicketHeadId() {
        return this.ticketHeadId;
    }

    public void setTicketHeadId(String ticketHeadId) {
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

    public String getTctp1() {
        return this.tctp1;
    }

    public void setTctp1(String tctp1) {
        this.tctp1 = tctp1;
    }

    public String getTctp2() {
        return this.tctp2;
    }

    public void setTctp2(String tctp2) {
        this.tctp2 = tctp2;
    }

    public String getTctp3() {
        return this.tctp3;
    }

    public void setTctp3(String tctp3) {
        this.tctp3 = tctp3;
    }

    public String getTctp4() {
        return this.tctp4;
    }

    public void setTctp4(String tctp4) {
        this.tctp4 = tctp4;
    }

    public BigDecimal getToca1() {
        return this.toca1;
    }

    public void setToca1(BigDecimal toca1) {
        this.toca1 = toca1;
    }

    public BigDecimal getToca2() {
        return this.toca2;
    }

    public void setToca2(BigDecimal toca2) {
        this.toca2 = toca2;
    }

    public BigDecimal getToca3() {
        return this.toca3;
    }

    public void setToca3(BigDecimal toca3) {
        this.toca3 = toca3;
    }

    public BigDecimal getToca4() {
        return this.toca4;
    }

    public void setToca4(BigDecimal toca4) {
        this.toca4 = toca4;
    }
}
