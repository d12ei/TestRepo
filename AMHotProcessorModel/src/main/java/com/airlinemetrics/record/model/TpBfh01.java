package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

public class TpBfh01 implements Serializable {

    private static final long serialVersionUID = 1L;
    private int hotFileId;
    private int addBy;
    private Date addDate;
    private String bspi;
    private String fsqn;
    private String isoc;
    private int modifyBy;
    private Date modifyDate;
    private Date prda;
    private Time ptime;
    private String resd;
    private String revn;
    private String tacn;
    private String tpst;

    public TpBfh01() {
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

    public String getBspi() {
        return this.bspi;
    }

    public void setBspi(String bspi) {
        this.bspi = bspi;
    }

    public String getFsqn() {
        return this.fsqn;
    }

    public void setFsqn(String fsqn) {
        this.fsqn = fsqn;
    }

    public String getIsoc() {
        return this.isoc;
    }

    public void setIsoc(String isoc) {
        this.isoc = isoc;
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

    public Date getPrda() {
        return this.prda;
    }

    public void setPrda(Date prda) {
        this.prda = prda;
    }

    public Time getPtime() {
        return this.ptime;
    }

    public void setPtime(Time ptime) {
        this.ptime = ptime;
    }

    public String getResd() {
        return this.resd;
    }

    public void setResd(String resd) {
        this.resd = resd;
    }

    public String getRevn() {
        return this.revn;
    }

    public void setRevn(String revn) {
        this.revn = revn;
    }

    public String getTacn() {
        return this.tacn;
    }

    public void setTacn(String tacn) {
        this.tacn = tacn;
    }

    public String getTpst() {
        return this.tpst;
    }

    public void setTpst(String tpst) {
        this.tpst = tpst;
    }
}
