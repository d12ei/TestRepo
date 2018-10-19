package com.airlinemetrics.hp.record;

/**
 * *
 * BKF81 Fare Calculation Record Page 143 of the Dish Handbook
 */
public class BKF81 extends AbstractRecord {

    private BKF81() {
        this.CN = "BKF81";
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        return this.save();
    }
}
