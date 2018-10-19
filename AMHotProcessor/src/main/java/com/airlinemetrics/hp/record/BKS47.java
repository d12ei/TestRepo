package com.airlinemetrics.hp.record;

/**
 * *
 * BKS31 Coupon Tax Information Page 76 of the Dish Handbook
 */
public class BKS47 extends AbstractRecord {

    private BKS47() {
        this.CN = "BKS47";
    }

    @Override
    public boolean processLine(String line, long transHeadID, String currentFormat) {
        return this.save();
    }
}
