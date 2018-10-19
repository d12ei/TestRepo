package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBki63;
import java.util.HashMap;
import java.util.Map;

public class BKI63Parser extends AbstractParser {

    @Override
    public TpBki63 parse(String line) {
        TpBki63 tpBki63 = new TpBki63();
        return tpBki63;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
