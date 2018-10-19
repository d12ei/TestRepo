package com.airlinemetrics.hp.record;

/**
 * *
 * BFT99 File Totals per Currency Type Record Page 151 of the Dish Handbook
 */
public class BFT99 extends AbstractRecord {

    private BFT99() {
        this.CN = "BFT99";
    }

    @Override
    public boolean processLine(String line, long hotFileID, String currentFormat) {
        return this.save();
    }
}
