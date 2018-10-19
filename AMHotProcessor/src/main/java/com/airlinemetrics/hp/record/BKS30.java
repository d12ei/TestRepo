package com.airlinemetrics.hp.record;

import java.sql.ResultSet;

/**
 * *
 * BKS30 STD/Document Amounts Record Page 119 of the Dish Handbook
 */
public class BKS30 extends AbstractRecord {

    private BKS30() {
        this.CN = "BKS30";
    }

    public boolean processLine(int hotID, String line, long ticketHeadID, String currentFormat) {
        return this.save();
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        return this.save();
    }

    public void setSequenceNos(long ticketHeadID) {
    }

    public ResultSet getListForTicketHead(long ticketHeadID, int limit) {
        return null;
    }
}
