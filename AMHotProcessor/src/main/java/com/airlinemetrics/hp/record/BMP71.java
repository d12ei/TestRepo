package com.airlinemetrics.hp.record;

/**
 * *
 * BMP71 Miscellaneous Document - Additional Information Record Page 134 of the
 * Dish Handbook
 */
public class BMP71 extends AbstractRecord {

    private BMP71() {
        this.CN = "BMP71";
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        return this.save();
    }
}
