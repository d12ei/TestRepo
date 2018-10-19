package com.airlinemetrics.hp.record;

/**
 * *
 * BMP74 Miscellaneous Document Information - Additional Print Lines Record Page
 * 138 of the Dish Handbook
 */
public class BMP74 extends AbstractRecord {

    private BMP74() {
        this.CN = "BMP74";
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        return this.save();
    }
}
