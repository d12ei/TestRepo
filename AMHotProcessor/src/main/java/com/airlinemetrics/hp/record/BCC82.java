package com.airlinemetrics.hp.record;

/**
 * *
 * BCC82 Additional Card Information Page 76 of the Dish Handbook
 */
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BCC82 extends AbstractRecord {

    PreparedStatement stmtSUM;

    private BCC82() {
        this.CN = "BCC82";
    }

    @Override
    public boolean processLine(String line, long ticketHeadID, String currentFormat) {
        return this.save();
    }
}
