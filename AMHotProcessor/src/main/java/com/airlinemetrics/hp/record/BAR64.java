package com.airlinemetrics.hp.record;

/**
 * *
 * BAR64 Document Amounts Record Page 129 of the Dish Handbook
 */
public class BAR64 extends AbstractRecord {

    private BAR64() {
        this.CN = "BAR64";
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        super.fields.clear();
        return false;
    }

    @Override
    protected boolean save() {
        return super.save(); //To change body of generated methods, choose Tools | Templates.
    }
}
