package com.airlinemetrics.record.model;

import java.io.Serializable;
import java.util.Date;

public class TpBkp83 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String transHeadId;
    private int addBy;
    private Date addDate;
    private String esac;
    private int modifyBy;
    private Date modifyDate;

    public TpBkp83() {
    }

    public String getTransHeadId() {
        return this.transHeadId;
    }

    public void setTransHeadId(String transHeadId) {
        this.transHeadId = transHeadId;
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

    public String getEsac() {
        return this.esac;
    }

    public void setEsac(String esac) {
        this.esac = esac;
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
}
