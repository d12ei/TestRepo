package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBkf81;
import java.util.HashMap;
import java.util.Map;

public class BKF81Parser extends AbstractParser {

    @Override
    public TpBkf81 parse(String line) {
        TpBkf81 tpBkf81 = new TpBkf81();
        return tpBkf81;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
