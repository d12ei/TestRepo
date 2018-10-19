package com.airlinemetrics.hp.record;

/**
 * *
 * BAR66 Additional Information Form of Payment Record Page 132 of the Dish
 * Handbook
 */
public class BAR66 extends AbstractRecord {

    private BAR66() {
        this.CN = "BAR66";
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        return this.save();
    }
}
