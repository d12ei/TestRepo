package com.airlinemetrics.hp.record;

/**
 * *
 * BKI63 Itinerary Data Segment Record Page 127 of the Dish Handbook
 */
import java.sql.*;
import java.text.ParseException;

public class BKI63_new extends AbstractRecord {
//    public void FTDA(ArrayList<FTDAModel> data) {
//        this.data = data;
//    }

    private BKI63_new() {
        this(false);
    }

    BKI63_new(boolean readOnly) {
        this.CN = "BKI63";
        this.readOnly = readOnly;
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        return this.save();
    }

    /**
     * *
     * Checks to see if the specified carrier code exists on the system.
     *
     * @param CarrierCode The CarrierCode to look for.
     * @return True if the carrier code is valid, false if not.
     */
    private boolean checkCarrier(String CarrierCode) {
        return false;
    }

    public boolean mileageExists(String origin, String dest) {
        return false;
    }

    public int getMileage(ResultSet rstBKS63) {
        return 0;
    }

    /**
     * *
     * Gets a list of all the stops for all the tickets issued to a particular
     * transaction.
     *
     * @param transHeadID The transHeadID to load all the tickets for.
     * @return A ResultSet of all the stops/bki63 recs that are associated with
     * the specified transaction.
     */
    public ResultSet getAllStopsForTransaction(long transHeadID) {
        return null;
    }

    /**
     * *
     * Gets a list of all the stops for all the tickets issued to a particular
     * transaction.
     *
     * @param transHeadID The transHeadID to load all the tickets for.
     * @return A ResultSet of all the stops/bki63 recs that are associated with
     * the specified transaction.
     */
    public ResultSet getAllForTransaction(long transHeadID) {
        return null;
    }

    /**
     * *
     * Gets a list of all the stops for all the tickets issued to a particular
     * Ticket.
     *
     * @param relatedTicketID The relatedTicketID to load all the sectors for
     * that ticket.
     * @return A ResultSet of all the stops/bki63 recs that are associated with
     * the specified ticket.
     */
    // Code CHnges 07/11/2015 to fix the CNJ AdjustmentIsues
    public ResultSet getAllForTicket(String relatedTransHeadid) {
        return null;
    }

    public ResultSet getAllForTransaction_new(long transHeadID) {
        return null;
    }

    /**
     * *
     * This method builds the flight date from the combination of the Date of
     * Issue and the Flight Date String (which doesn't contain the year)
     *
     * @param itinerarySegmentID The id of the Itinerary Segment that we're
     * updating the flight date for.
     * @param DAIS The Date of Issue
     * @param FTDA The flight Date
     */
    public void setFlightDate(long itinerarySegmentID, String DAIS, String FTDA) {

    }

    public boolean updateFlightDate(long itinerarySegmentID, String flightDate) {
        return false;
    }

    // Update Open FTDA for the transactions
    public boolean updateOpenFTDA(long itinerarySegmentID, String FTDA) {
        return false;
    }

    public String setFTDA(String DAIS, String FTDA) {
        return "";
    }

    // Load all open FTDA transactions
//    public ArrayList<FTDAModel> loadData(long transHeadID) {
//        ArrayList<FTDAModel> arrayList = null;
//        return arrayList;
//    }
    // Check whether the ticket is open FTDA or not
    public boolean checkOpenFTDA(long Transheadid) {
        return false;
    }

    // Update Open ftda based on the mid/last and first values
    public void execute() throws ParseException {

    }

    // Update Open ftda with middle values
    private void updateWithMiddleDate() throws ParseException {
    }

    // Update Open ftda with middle values
    private void updatePreviousDate(int count, int index, String refDateStr) throws ParseException {
    }

    // Update Open ftda with Last segment values
    private void updateFTDAWithLastSegment() throws ParseException {
    }

    // Update Open ftda with DAIS values
    private void updateFTDAwithDAIS() throws ParseException {
    }

    /**
     * Check whether all the ftda values are null or not.
     *
     * @return true if null else false.
     */
    private boolean hasNullValues() {

        return true;
    }

    /**
     *
     * @return
     */
    private boolean hasLastSegmentFilled() {
        return false;
    }

}
