package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBmd75;
import java.util.HashMap;
import java.util.Map;

public class BMD75Parser extends AbstractParser {

    @Override
    public TpBmd75 parse(String line) {
        TpBmd75 tpBmd75 = new TpBmd75();
        return tpBmd75;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
