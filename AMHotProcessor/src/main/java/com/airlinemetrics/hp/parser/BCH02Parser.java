package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBch02;
import java.util.HashMap;
import java.util.Map;

public class BCH02Parser extends AbstractParser {

    @Override
    public TpBch02 parse(String line) {
        TpBch02 tpBch02 = new TpBch02();
        return tpBch02;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
