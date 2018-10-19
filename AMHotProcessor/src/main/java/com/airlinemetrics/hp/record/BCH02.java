package com.airlinemetrics.hp.record;

/**
 * *
 * Billing Analysis Cycle Header Record Page 113 of the Dish Handbook
 */
public class BCH02 extends AbstractRecord {

    private BCH02() {
        this.CN = "BCH02";
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        return this.save();
    }
}
