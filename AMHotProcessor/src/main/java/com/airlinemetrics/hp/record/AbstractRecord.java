package com.airlinemetrics.hp.record;

import java.sql.Connection;
import java.util.Map;

public abstract class AbstractRecord {

    protected Connection conn;
    protected Map<String, String> fields;
    protected String CN;
    protected boolean readOnly;

    public abstract boolean processLine(String line, long ticketHeadID, String currentFormat);

    protected boolean save() {
//        code above this comment
        fields.clear();
        return true;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }
}
