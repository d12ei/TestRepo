package com.airlinemetrics.hp.record;

/**
 * *
 * BKP84 Form of Payment Record Page 146 of the Dish Handbook
 */
import java.sql.*;

public class BKP84 extends AbstractRecord {

    PreparedStatement stmtSUM;

    private BKP84() {
        this.CN = "BKP84";
    }

    @Override
    public boolean processLine(String line, long transHeadID, String currentFormat) {
        return this.save();
    }

    public ResultSet getFormOfPaymentSumForTicket(long transHeadID, String formOfPaymentCode) {
        return null;
    }
}
