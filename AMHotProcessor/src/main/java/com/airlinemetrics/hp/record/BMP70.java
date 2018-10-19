package com.airlinemetrics.hp.record;

/**
 * *
 * BMP70 Miscellaneous Document Information - Reason for Issuance Record Page
 * 133 of the Dish Handbook
 */
public class BMP70 extends AbstractRecord {

    private BMP70() {
        this.CN = "BMP70";
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        return this.save();
    }
}
