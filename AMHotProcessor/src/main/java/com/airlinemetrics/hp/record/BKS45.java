package com.airlinemetrics.hp.record;

/**
 * *
 * BKS45 Related Ticket/Document Information Record Page 125 of the Dish
 * Handbook
 */
import com.airlinemetrics.hp.record.AbstractRecord;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BKS45 extends AbstractRecord {

    PreparedStatement stmtBKS45Count;
    PreparedStatement stmtBKS45RTDN;
    PreparedStatement stmtRelatedMF;
    PreparedStatement stmtRelatedMFCnj;

    private BKS45() {
        this.CN = "BKS45";
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        return this.save();
    }

    /**
     * *
     * Gets the total number of BKS45 records for a given transaction AND gets
     * the total number of BKS45 records for a given transaction that also have
     * a matching ticket (via RTDN)
     *
     * @param transHeadID The ID of the transaction
     * @param TRNC The transaction control type to look for
     * @return Returns a ResultSet with integer values for NumTotalBKS45 and
     * NumMatchingBKS45
     */
    public ResultSet getBKS45CountsForTransaction(long transHeadID, String TRNC) {
        return null;
    }

    /**
     * *
     * Gets a resultset of all matching tp_transamounts records for a specific
     * RTDN (related ticket document number) and TRNC
     *
     * @param RTDN The RTDN
     * @param TRNC The TRNC
     * @param TransHeadID
     * @return
     */
    public ResultSet getBKS45ForRTDNAndTRNC(String RTDN, String TRNC, long TransHeadID) {
        return null;
    }

    //Code Changes 7/11/2015
    public ResultSet findRelatedMileageFare(String TransHeadId) {
        return null;
    }
    //Added by suneetha to fix the Adjustments fro CNJ ticket when there is not primary in bks45

    public ResultSet findRelatedMileageFareCNJ(long ticketInfoID, long transHeadID) {
        return null;
    }
}
