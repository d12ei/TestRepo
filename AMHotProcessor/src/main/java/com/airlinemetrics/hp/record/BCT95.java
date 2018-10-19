package com.airlinemetrics.hp.record;

/**
 * *
 * BCT95 Billing Analysis (Cycle) Totals per Currency Type Record Page 150 of
 * the Dish Handbook
 */
public class BCT95 extends AbstractRecord {

    private BCT95() {
        this.CN = "BCT95";
    }

    @Override
    public boolean processLine(String line, long hotFileID, String currentFormat) {
        return this.save();
    }
}
