package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBmd76;
import java.util.HashMap;
import java.util.Map;

public class BMD76Parser extends AbstractParser {

    @Override
    public TpBmd76 parse(String line) {
        TpBmd76 tpBmd76 = new TpBmd76();
        return tpBmd76;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
