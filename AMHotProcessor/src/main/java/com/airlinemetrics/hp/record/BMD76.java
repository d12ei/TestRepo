package com.airlinemetrics.hp.record;

/**
 * *
 * BMD76 Electronic Miscellaneous Document Coupon Remarks Record Page 140 of the
 * Dish Handbook
 */
public class BMD76 extends AbstractRecord {

    private BMD76() {
        this.CN = "BMD76";
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        return this.save();
    }
}
