package com.airlinemetrics.hp.record;

/**
 * *
 * File Header record Page 112 of the Dish Handbook
 */
public class BFH01 extends AbstractRecord {

    private BFH01() {
        this(false);
    }

    BFH01(boolean readOnly) {
        this.CN = "BFH01";
        this.readOnly = readOnly;
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        return this.save();
    }
}
