package com.airlinemetrics.hp.record;

/**
 * ;
 * BKS46 Qualifying Issue Information for Sales Transactions Record Page 126 of
 * the Dish Handbook
 */
public class BKS46 extends AbstractRecord {

    private BKS46() {
        this.CN = "BKS46";
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        return this.save();
    }
}
