package com.airlinemetrics.hp.record;

/**
 * *
 * BMD75 Electronic Miscellaneous Document Coupon Detail Record Page 139 of the
 * Dish Handbook
 */
public class BMD75 extends AbstractRecord {

    private BMD75() {
        this.CN = "BMD75";
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        return this.save();
    }
}
