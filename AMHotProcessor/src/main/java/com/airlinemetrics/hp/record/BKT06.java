package com.airlinemetrics.hp.record;

/**
 * *
 * Transaction Header Record BKT06 Page 115 of the Dish Handbook
 */
public class BKT06 extends AbstractRecord {

    private BKT06() {
        this.CN = "BKT06";
    }

    @Override
    public boolean processLine(String line, long offHeadID, String currentFormat) {
        return this.save();
    }

    public void updateOriginDestination(long transHeadID, String origin, String destination, int destSec) {
    }

    /**
     * This function calculate trip days per transaction of a HOT file
     *
     * @param transHeadID
     */
    public void updateTripDays(long transHeadID) {
    }

    /**
     * This function calculate days difference from ticket issue date to flight
     * date per transaction of a HOT file
     *
     * @param transHeadID
     */
    public void updateTicketTravelDays(long transHeadID) {
    }

    public String getIATACountryId(String iata) {
        return "";
    }

    // This function gets country_code of Airline in DB
    public String checkAirportExists(String str) {
        return "";
    }

    public String checkTicketingAirlineCodeExists(String TACN) {
        return "";
    }

    public String checkCountryExists(String country_code, String iata_country_id, boolean isCarriers) {
        return "";
    }

    public String checkZoneExists(String zone_code) {
        return "";
    }

    public String getTACN() {
        return "";
    }

    public void setTACN(String tACN) {
    }
}
