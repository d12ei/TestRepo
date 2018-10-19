package com.airlinemetrics.hp.record;

/**
 * *
 * BMP73 Optional Agency/Airline Information Record Page 137 of the Dish
 * Handbook
 */
public class BMP73 extends AbstractRecord {

    private BMP73() {
        this.CN = "BMP73";
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        return this.save();
    }
}
