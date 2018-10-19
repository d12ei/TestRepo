package com.airlinemetrics.hp.record;

/**
 * *
 * BKS39 Commission Record Page 121 of the Dish Handbook
 */
import java.sql.*;
import java.util.logging.Logger;

public class BKS39 extends AbstractRecord {

    private BKS39(Connection conn, Logger log) {
        this.CN = "BKS39";
    }

    public boolean processLine(int hotID, String line, long ticketHeadID, String currentFormat) {
        return this.save();
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setSequenceNos(long ticketHeadID) {
    }

    public ResultSet getListForTicketHead(long ticketHeadID, int limit) {
        return null;
    }

    public boolean isSTATisARC(long ticketHeadID, int limit) {
        return false;
    }

    public void setSTATBKS39(Long ticketHeadID, String STAT) {
    }

    public void setSTATTickets(Long transHeadId, String STAT) {
    }
}
