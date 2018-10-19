package com.airlinemetrics.hp.record;

/**
 * *
 * BKS31 Coupon Tax Information Page 76 of the Dish Handbook
 */
import java.sql.*;

public class BKS31 extends AbstractRecord {

    PreparedStatement stmtSUM;

    private BKS31() {
        this.CN = "BKS31";
    }

    @Override
    public boolean processLine(String line, long transHeadID, String currentFormat) {
        return this.save();
    }
}
