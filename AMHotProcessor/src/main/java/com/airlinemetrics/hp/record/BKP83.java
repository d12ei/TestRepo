package com.airlinemetrics.hp.record;

/**
 * *
 * BKP83 Electronic Transaction Record Page 144 of the Dish Handbook
 */
public class BKP83 extends AbstractRecord {

    private BKP83() {
        this.CN = "BKP83";
    }

    @Override
    public boolean processLine(String line, long transHeadID, String currentFormat) {
        return this.save();
    }
}
