package com.airlinemetrics.hp.record;

/**
 * *
 * BKS24 Ticket/Document Identification Record Page 117 of the Dish Handbook
 */
public class BKS24 extends AbstractRecord {

    String TRNC = "";
    String AGTN = "";

    private BKS24() {
        this(false);
        String x = "";
    }

    private BKS24(boolean readOnly) {
        this.CN = this.getClass().getSimpleName();
        this.readOnly = readOnly;
    }

    public String getTRNC() {
        return TRNC;
    }

    public void setTRNC(String tRNC) {
        TRNC = tRNC;
    }

    public String getAGTN() {
        return AGTN;
    }

    public void setAGTN(String aGTN) {
        AGTN = aGTN;
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        return this.save();
    }
}
