package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBks42;
import java.util.HashMap;
import java.util.Map;

public class BKS42Parser extends AbstractParser {

    @Override
    public TpBks42 parse(String line) {
        TpBks42 tpBks42 = new TpBks42();
        return tpBks42;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
