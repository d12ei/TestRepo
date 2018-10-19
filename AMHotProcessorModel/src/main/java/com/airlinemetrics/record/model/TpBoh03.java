package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.util.Date;

public class TpBoh03 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String offHeadId;
    private int addBy;
    private Date addDate;
    private String agtn;
    private String cutp;
    private int hotFileId;
    private int iataId;
    private String mloc;
    private int modifyBy;
    private Date modifyDate;
    private Date rmed;

    public TpBoh03() {
    }

    public String getOffHeadId() {
        return this.offHeadId;
    }

    public void setOffHeadId(String offHeadId) {
        this.offHeadId = offHeadId;
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

    public String getAgtn() {
        return this.agtn;
    }

    public void setAgtn(String agtn) {
        this.agtn = agtn;
    }

    public String getCutp() {
        return this.cutp;
    }

    public void setCutp(String cutp) {
        this.cutp = cutp;
    }

    public int getHotFileId() {
        return this.hotFileId;
    }

    public void setHotFileId(int hotFileId) {
        this.hotFileId = hotFileId;
    }

    public int getIataId() {
        return this.iataId;
    }

    public void setIataId(int iataId) {
        this.iataId = iataId;
    }

    public String getMloc() {
        return this.mloc;
    }

    public void setMloc(String mloc) {
        this.mloc = mloc;
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

    public Date getRmed() {
        return this.rmed;
    }

    public void setRmed(Date rmed) {
        this.rmed = rmed;
    }
}
