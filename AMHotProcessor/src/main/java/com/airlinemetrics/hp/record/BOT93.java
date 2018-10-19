package com.airlinemetrics.hp.record;

/**
 * *
 * BOT93 Office Subtotals per Transaction Code and Currency Type Record Page 148
 * of the Dish Handbook
 */
public class BOT93 extends AbstractRecord {

    private BOT93() {
        this.CN = "BOT93";
    }

    @Override
    public boolean processLine(String line, long offHeadID, String currentFormat) {
        return this.save();
    }
}
