package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBkt06;
import java.util.HashMap;
import java.util.Map;

public class BKT06Parser extends AbstractParser {

    @Override
    public TpBkt06 parse(String line) {
        TpBkt06 tpBkt06 = new TpBkt06();
        return tpBkt06;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
