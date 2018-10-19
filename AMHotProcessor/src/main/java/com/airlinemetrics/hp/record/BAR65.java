package com.airlinemetrics.hp.record;

/**
 * *
 * BAR65 Additional Information Passenger Record Page 131 of the Dish Handbook
 */
public class BAR65 extends AbstractRecord {

    private BAR65() {
        this.CN = "BAR65";
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        return this.save();
    }
}
