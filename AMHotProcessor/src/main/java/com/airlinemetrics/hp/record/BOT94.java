package com.airlinemetrics.hp.record;

/**
 * *
 * BOT94 Office Totals per Currency Type Record Page 149 of the Dish Handbook
 */
public class BOT94 extends AbstractRecord {

    private BOT94() {
        this.CN = "BOT94";
    }

    @Override
    public boolean processLine(String line, long offHeadID, String currentFormat) {
        return super.save();
    }

}
