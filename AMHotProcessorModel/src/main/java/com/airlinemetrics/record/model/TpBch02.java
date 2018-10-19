package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.util.Date;

public class TpBch02 implements Serializable {

    private static final long serialVersionUID = 1L;
    private int hotFileId;
    private int addBy;
    private Date addDate;
    private Date baed;
    private String dyri;
    private String hred;
    private int modifyBy;
    private Date modifyDate;
    private String pcyc;
    private String pdai;

    public TpBch02() {
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

    public Date getBaed() {
        return this.baed;
    }

    public void setBaed(Date baed) {
        this.baed = baed;
    }

    public String getDyri() {
        return this.dyri;
    }

    public void setDyri(String dyri) {
        this.dyri = dyri;
    }

    public String getHred() {
        return this.hred;
    }

    public void setHred(String hred) {
        this.hred = hred;
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

    public String getPcyc() {
        return this.pcyc;
    }

    public void setPcyc(String pcyc) {
        this.pcyc = pcyc;
    }

    public String getPdai() {
        return this.pdai;
    }

    public void setPdai(String pdai) {
        this.pdai = pdai;
    }
}
