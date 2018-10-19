package com.airlinemetrics.hp.record;

/**
 * *
 * BKS42 Tax on Commission Record Page 123 of the Dish Handbook
 */
public class BKS42 extends AbstractRecord {

    private BKS42() {
        this.CN = "BKS42";
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        return this.save();
    }
}
