package com.airlinemetrics.hp.record;

/**
 * *
 * Reporting Agent Office Header Record Page 114 of the Dish Handbook
 */
public class BOH03 extends AbstractRecord {

    // private HashMap IATAMap;
    // BOH03(Connection conn, Logger log, HashMap IATAMap, boolean createIATA) {
    private BOH03() {
        this.CN = "BOH03";
    }

    // BOH03(Connection conn, Logger log, HashMap IATAMap, boolean createIATA,
    // boolean readOnly) {
    private BOH03(boolean readOnly) {
        this.CN = "BOH03";
    }

    public boolean checkMissingIATA(String IATA_No) {
        return true;
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        return super.save();
    }
}
